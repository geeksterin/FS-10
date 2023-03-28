// package tictactoe;

public class Main{
    public static void main(String [] args){
        Player A = new Player();
        A.setName("James");
        A.setSymbol('0');
        Player B = new Player();
        B.setName("Harry");
        B.setSymbol('X');


        Player [] players = {A,B};

        Board board = new Board(3);
        Game game = new Game(players, board);
       
        game.play();


        
    }
}