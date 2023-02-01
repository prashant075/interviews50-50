package z_lld.meesho_SnackLadder.entity;

import java.util.Map;

public class Game {

    private String gameId;
    Map<Integer, Integer> snakes;
    Map<Integer, Integer> ladders;


    public Game( String id, Map<Integer, Integer> snakes, Map<Integer, Integer> ladders) {
        this.gameId = id;
        this.snakes = snakes;
        this.ladders = ladders;
    }

    public String getGameId() {
        return gameId;
    }

    public Map<Integer, Integer> getSnakes() {
        return snakes;
    }



    public Map<Integer, Integer> getLadders() {
        return ladders;
    }

}
