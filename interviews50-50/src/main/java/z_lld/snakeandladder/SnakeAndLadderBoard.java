package z_lld.snakeandladder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SnakeAndLadderBoard {
    private List<Ladder> ladders;
    private List<Snake> snakes;
    private int size;
    private Map<String, Integer> playerPiece;

    public SnakeAndLadderBoard(int size) {
        this.ladders = new ArrayList<>();
        this.snakes = new ArrayList<>();
        this.playerPiece = new HashMap<>();
        this.size = size;
    }

    public List<Ladder> getLadders() {
        return ladders;
    }

    public List<Snake> getSnakes() {
        return snakes;
    }

    public Map<String, Integer> getPlayerPiece() {
        return playerPiece;
    }

    public SnakeAndLadderBoard setLadders(List<Ladder> ladders) {
        this.ladders = ladders;
        return this;
    }

    public SnakeAndLadderBoard setSnakes(List<Snake> snakes) {
        this.snakes = snakes;
        return this;
    }

    public SnakeAndLadderBoard setPlayerPiece(Map<String, Integer> playerPiece) {
        this.playerPiece = playerPiece;
        return this;
    }
}
