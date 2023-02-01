package z_lld.tic_tac_toe;

import java.util.*;

public class GameBoard {
    int[] rows;
    int[] cols;
    Set<Integer> usedCell;
    private boolean isGameOver;
    Queue<Player> players;
    int count ;
    Scanner sc;
    int diagonal;
    int antidiagonal;

    public GameBoard(Player[] palyers) {
        this.rows = new int[3];
        this.cols = new int[3];
        this.usedCell= new HashSet<>();
        this.players = new LinkedList<>();
        this.players.add(palyers[0]);
        this.players.add(palyers[1]);
        this.isGameOver = false;
        this.count = 0;
        this.sc = new Scanner(System.in);
    }
    public void play(){
        while (!isGameOver){
            if(count==10){
                System.out.println("Match Drawn");
                break;
            }
            Player currPlayer = players.poll();
            int nextcell = nextMove(currPlayer);
            putMove(nextcell, currPlayer.symbol);
            players.add(currPlayer);

        }
    }

    private void putMove(int nextInt, int symbol) {
        int x = nextInt/3;
        int y = (nextInt%3);
        int n=3;
        rows[x]+=symbol;
        cols[y]+=symbol;
        if(x==y){
            diagonal++;
        }
        if(x+y==n-1){
            antidiagonal++;
        }
        if(Math.abs(rows[x])==n||
                Math.abs(rows[y])==n||
                Math.abs(diagonal)==n||
                Math.abs(antidiagonal) ==n
        ){
            System.out.println("won");
            System.exit(100);
        }

    }

    private int nextMove(Player player) {
        System.out.println("Enter value from 1 to 9 for Palyer "+player.id);
        int move = sc.nextInt();
        if(!validMove(move)){
            System.out.println("Cell Already Used Enter Other Cell");
            nextMove(player);
        }
        return move;
    }

    private boolean validMove(int move) {
        if(usedCell.contains(move))
            return false;
        else
            usedCell.add(move);
        return true;
    }
}
