package z_lld.meesho_SnackLadder;


import z_lld.meesho_SnackLadder.service.impl.SnakeLadderGameService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        SnakeLadderGameService service = new SnakeLadderGameService();
        Map<Integer, Integer> snackMap = new HashMap<>();
        snackMap.put(10,5);
        snackMap.put(50,10);
        snackMap.put(80,30);
        Map<Integer, Integer> ladderMap = new HashMap<>();
        ladderMap.put(15,40);
        ladderMap.put(25,70);
        ladderMap.put(45,90);
        List<Integer> playerList = new ArrayList<>();
        playerList.add(1);
        playerList.add(2);
        playerList.add(3);
        System.out.println("Game with Id " + service.createGame(10,snackMap,ladderMap,playerList)+" started");
        service.startGame();

    }
}
