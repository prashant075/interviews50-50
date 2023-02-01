package z_lld.meesho_SnackLadder.service.impl;

import z_lld.meesho_SnackLadder.entity.Game;
import z_lld.meesho_SnackLadder.util.Utils;
import z_lld.meesho_SnackLadder.service.GameApplication;

import java.util.*;

public class SnakeLadderGameService implements GameApplication {

    /*
    return unique game id
    */
    private static final  int MIN =1;
    private static final int  MAX =6;
    Map<Integer, Integer> playerPosition;
    List<Integer> playersId;

    Queue<Integer> nextTurn;
    Game game;
    String gameId;
    int boardSize=0;
    private int counter=1;
    public String createGame(int boardSize, Map<Integer, Integer> snakes, Map<Integer, Integer> ladders, List<Integer> playerIds)  {
        //validateGame()
        this.boardSize = boardSize*boardSize;
        this.playersId = playerIds;
        this.nextTurn = new LinkedList<>();
        this.playerPosition = new HashMap<>();
        setPlayerPosition(playerIds);
        String gameId = Utils.generateId();
        this.game = new Game(gameId, snakes,ladders );
        return gameId;
    }



    private void setPlayerPosition(List<Integer> playersId) {
        for(Integer playerId:playersId){
            playerPosition.put(playerId,0);
            nextTurn.add(playerId);
        }
    }
    public void startGame(){

        while(Boolean.FALSE.equals( isGameCompleted())){
            Integer playerId = nextTurn.poll();
            rollDiceAndMove(gameId, playerId);
        }
    }
    private Boolean isGameCompleted(){
        Integer currPlayerCount = nextTurn.size();
        return  nextTurn.size()>currPlayerCount;
    }
    /*
    return false
        - if player not part of this game
        - if the game is already ended
        - if the game id doesn't exist
        - if dice already allocated
    return true if hold dice is succeeded
    */
    public Boolean holdDice(String gameId, int playerId) {
        if(!playersId.contains(playerId)){
            return false;
        }
        if(Boolean.TRUE.equals(isGameCompleted())) return false;
        if(game.getGameId()==null) return  false;
        return true;
    }

    /*
    return false
        - if any player who doesn't hold the dice calls this
        - if dice is not allocated
        - if the game is already ended
        - if the game id doesn't exist
    otherwise roll dice and move and return true
    */
    public Boolean rollDiceAndMove(String gameId, int playerId) {
        if(Boolean.TRUE.equals(holdDice(gameId, playerId))){
            Integer nextRoll = nextMove();
            System.out.println("Player "+playerId+" Roll the Dice Got Value "+ nextRoll);
            Integer oldPosition = playerPosition.get(playerId);
            int newPosition = oldPosition+nextRoll;
            //Check Snack and the position
            if(newPosition>boardSize ){
                newPosition = oldPosition;
            }else{
                newPosition = validateNewPositionWithSnackAndLadder(newPosition);
                newPosition = Boolean.TRUE.equals(checkPositionsAlreadyOccupied(playerId,newPosition))?oldPosition:newPosition;
            }

            playerPosition.put(playerId, newPosition);
            if(!hasWonGame(playerId)){
                nextTurn.add(playerId);
                System.out.println("Player "+playerId+ " Moved to new Position "+ newPosition);
            }else{
                System.out.println("Player "+playerId+" won the game with Rank "+counter++);
                playerPosition.remove(playerId);
                System.exit(0);
            }
            return true;
        }else{
            return false;
        }

    }

    private boolean hasWonGame(int playerId) {
        Integer finalPosition = playerPosition.get(playerId);
        return finalPosition==boardSize ;
    }

    private Boolean checkPositionsAlreadyOccupied(int playerId, int newPosition) {
        for(Map.Entry<Integer, Integer> players:playerPosition.entrySet()){
            if(players.getKey()!=playerId){
                if(players.getValue()==newPosition ){
                    System.out.println("Player "+playerId+" Move " +newPosition + " is Invalid Because Position Occupied");
                    return true;
                }
            }
        }
        return false;
    }

    private Integer validateNewPositionWithSnackAndLadder(int newPosition) { //80
        int prevPosition;
        do{
            prevPosition = newPosition;
            for(Map.Entry<Integer, Integer> snack:game.getSnakes().entrySet()){
                if(snack.getKey()==newPosition){
                    newPosition = snack.getValue();
                }
            }
            for(Map.Entry<Integer, Integer> ladder:game.getLadders().entrySet()){
                if(ladder.getKey()==newPosition){
                    newPosition = ladder.getValue();
                }
            }
        }while(prevPosition!=newPosition);
        return newPosition;
    }

    private Integer nextMove() {
        return Utils.generateRandomNumber(MIN,MAX);
    }
}

