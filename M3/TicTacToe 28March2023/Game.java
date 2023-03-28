// package tictactoe;

public class Game{

    Player [] players;

    Board board;
    int turn;       // turn -> 0 (p1) && 1 (p2)
    int moves;      //current total moves

    boolean gameOver;   // true - false;

    //2 more properties;


    Game(Player [] players, Board board){
        this.players = players;
        this.board = board;
        turn = 0;
        moves = 0;
        gameOver = false;
    }

    private void printBoard(){
        for(int i = 0; i < this.board.size; i++){
            for(int j = 0; j < board.size; j++){
                System.out.print(board.board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void play(){
        printBoard();
    } 



}