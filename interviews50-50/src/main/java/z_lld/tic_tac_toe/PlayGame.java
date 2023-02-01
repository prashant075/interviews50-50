package z_lld.tic_tac_toe;

public class PlayGame {
    public static void main(String[] args) {
        Player player1 = new Player(1,1);
        Player player2 = new Player(2,-1);
        GameBoard gameBoard = new GameBoard(new Player[]{player1,player2});
        gameBoard.play();
    }
}
