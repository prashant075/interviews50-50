package z_lld.snakeandladder;

import java.util.*;

public class SnakeAndLadderBoardService {
    private static SnakeAndLadderBoard snakeAndLadderBoard;
    private int intialPlayerSize;
    private Queue<Player> players;
    private boolean isCompleted;
    private  static int count=0;

    private int noOfDice;
    private static final int DEFAULT_BOARD_SIZE =100;
    private static final int DEFAULT_NO_OF_DICES =1;

    public SnakeAndLadderBoardService(int size){
        this.snakeAndLadderBoard = new SnakeAndLadderBoard(size);
        this.players = new LinkedList<>();
        this.noOfDice = DEFAULT_NO_OF_DICES;
    }
    public SnakeAndLadderBoardService(){
        this(SnakeAndLadderBoardService.DEFAULT_BOARD_SIZE);
    }
    public  void setPlayers(List<Player> players){
        this.players = new LinkedList<>();
        this.intialPlayerSize = players.size();
        Map<String, Integer> playerPiece = new HashMap<>();
        for(Player player:players){
            this.players.add(player);
            playerPiece.put(player.getId(),0);
        }
        snakeAndLadderBoard.setPlayerPiece(playerPiece);
    }
    public void setSnake(List<Snake> snake){
        snakeAndLadderBoard.setSnakes(snake);
    }
    public void setLadder(List<Ladder> ladder){
        snakeAndLadderBoard.setLadders(ladder);
    }
    private static int getNewPositionAfterGoingThroughSnakesAndLadders(int newPosition){
        int prevPosition;
        do{
            prevPosition=newPosition;
            for(Snake snake:snakeAndLadderBoard.getSnakes()){
                if(newPosition==snake.getStart()){
                    newPosition=snake.getEnd();
                }
            }
            for(Ladder ladder:snakeAndLadderBoard.getLadders()){
                if(newPosition==ladder.getStart()){
                    newPosition=ladder.getEnd();
                }
            }
        }while(prevPosition!=newPosition);
        return newPosition;
    }
    private void movePlayer(Player player, int position){
        int oldPosition = snakeAndLadderBoard.getPlayerPiece().get(player.getId());
        int newPosition = oldPosition+position;
        if(newPosition>DEFAULT_BOARD_SIZE){
            newPosition =oldPosition;
        }else{
            newPosition= getNewPositionAfterGoingThroughSnakesAndLadders(newPosition);
        }

        if(count==0) count++;
        if(count==1) {
        for(Map.Entry<String, Integer> entry : snakeAndLadderBoard.getPlayerPiece().entrySet()){
            String playerId = entry.getKey();
            if(player.getId()!=playerId){
                if(entry.getValue()==newPosition){
                    snakeAndLadderBoard.getPlayerPiece().put(playerId,0);
                    System.out.println("Player " + player.getName()+  " Move to Start Again");
                }
            }
        }
        }
        snakeAndLadderBoard.getPlayerPiece().put(player.getId(),newPosition);
        System.out.println(player.getName() + " rolled a " + position + " and moved from " + oldPosition +" to " + newPosition);
    }
    private boolean hasPlayerWon(Player player){
        int position = snakeAndLadderBoard.getPlayerPiece().get(player.getId());
        return position==DEFAULT_BOARD_SIZE;
    }
    private int getTotalValueAfterDiceRolls() {
        // Can use noOfDices and setShouldAllowMultipleDiceRollOnSix here to get total value (Optional requirements)
        return DiceService.roll();
    }
    private boolean isGameCompleted(){
        int currentPlayer = players.size();
        return currentPlayer==1;// <intialPlayerSize;
    }
    public void startGame(){
        while(!isGameCompleted()){
            int totalDice = getTotalValueAfterDiceRolls();
            Player player = players.poll();
            movePlayer(player,totalDice);
            if(hasPlayerWon(player)){
                System.out.println(player.getName() + " wins the game");
                snakeAndLadderBoard.getPlayerPiece().remove(player.getId());
            }else{
                players.add(player);
            }

        }
    }
}
