package TicTacToe;

public class Main{
    public static void main(String [] args){
        Player A = new Player();
        A.setName("Player 1");
        A.setSymbol('0');

        Player B = new Player();
        B.setName("Player 2");
        B.setSymbol('X');

        Board board = new Board(3);

        
    }
}