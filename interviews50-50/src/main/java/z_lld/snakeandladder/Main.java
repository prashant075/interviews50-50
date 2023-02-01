package z_lld.snakeandladder;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Snake> snakeList = new ArrayList<>();
        snakeList.add(new Snake(90,10));
        snakeList.add(new Snake(50,20));
        snakeList.add(new Snake(70,30));
        List<Ladder> ladders = new ArrayList<>();
        ladders.add(new Ladder(5,30));
        ladders.add(new Ladder(15,60));
        ladders.add(new Ladder(35, 95));
        List<Player> playerList = new ArrayList<>();
        playerList.add(new Player("1","ABC"));
        playerList.add(new Player("2", "XYZ"));
        playerList.add(new Player("3", "EDF"));
        SnakeAndLadderBoardService snakeAndLadderBoardService = new SnakeAndLadderBoardService();
        snakeAndLadderBoardService.setLadder(ladders);
        snakeAndLadderBoardService.setSnake(snakeList);
        snakeAndLadderBoardService.setPlayers(playerList);
        snakeAndLadderBoardService.startGame();
    }
}
