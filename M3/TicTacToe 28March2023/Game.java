// package tictactoe;
import java.util.*;

public class Game{

    Player [] players;

    Board board;
    int turn;       // turn -> 0 (p1) && 1 (p2)
    int moves;      //current total moves

    boolean gameOver;   // true - false;

    String zero;
    String cross;

    


    Game(Player [] players, Board board){
        this.players = players;
        this.board = board;
        turn = 0;
        moves = 0;
        gameOver = false;
        zero = "000";
        cross = "XXX";
    }

    private void printBoard(){
        for(int i = 0; i < this.board.size; i++){
            for(int j = 0; j < board.size; j++){
                System.out.print(board.matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void play(){
        printBoard();
        int size = board.size;

        while(gameOver == false){
            moves++;
            int [] idx = getIndex();
            int x = idx[0];
            int y = idx[1];

            board.matrix[x][y] = players[turn].getSymbol();

            //draw
            if(moves >= size*size){
                System.out.println("Game Draw");
                printBoard();
                return;
            }

            if(checkCombinations() == true){
                //winner
                gameOver = true;
                printBoard();
                System.out.println("Winner is : " + players[turn].getName());
                return;
            }

            turn = 1-turn;
            printBoard();
        }



    } 

    private int [] getIndex(){
        while(true){
            System.out.println("Player : " + players[turn].getName() + " which position(x,y) do you want to insert?");
            Scanner scn = new Scanner(System.in);
            int x = scn.nextInt();
            int y = scn.nextInt();
            

            if(x < 0 || y < 0 || x >= board.size || y >= board.size){
                System.out.println("Invalid Index");
                continue;
            }

            if(board.matrix[x][y] != '-'){
                 System.out.println("Cell is occupied");
                 continue;
            }
            // int [] ans = new int[2];
            // ans[0] = x;
            // ans[1] = y;

            // return ans;

            return new int[]{x,y};
        }
    }

    private boolean checkCombinations(){
        int n = board.size;

        //row wise direction 1
        for(int i = 0; i < n; i++){
            String pattern  = "";
            for(int j = 0; j < n; j++){
                pattern += board.matrix[i][j];
            }
            if(pattern.equals(zero) || pattern.equals(cross)){
                return true;
            }
        } 

        //col wise direction 2
        for(int j = 0; j < n; j++){
            String pattern  = "";
            for(int i = 0; i < n; i++){
                pattern += board.matrix[i][j];
            }
            if(pattern.equals(zero) || pattern.equals(cross)){
                return true;
            }
        } 

        //diag direction 3
        String pattern  = "";
        int i = 0;
        int j = 0;
        while(i < n){
            pattern += board.matrix[i][j];
            i++;
            j++;
        }

        if(pattern.equals(zero) || pattern.equals(cross)){
            return true;
        }

         //anti diag direction 4
        pattern  = "";
        i = 0;
        j = n-1;
        while(i < n){
            pattern += board.matrix[i][j];
            i++;
            j--;
        }

        if(pattern.equals(zero) || pattern.equals(cross)){
            return true;
        }


        return false;
    }




}