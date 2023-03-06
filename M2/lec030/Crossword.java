import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    
    public static boolean dirOne(char [][] A , String word, int i, int j){
        // from left to right
        j++;
        for(int k = 1; k < word.length(); k++){
            if ( j >= A.length){
                return false;
            }
            else if(word.charAt(k) != A[i][j]){
                return false;
            }
            j++;
        }
        return true;
        
    }
    public static boolean dirTwo(char [][] A , String word, int i, int j){
        //from top to bottom
        i++;
        for(int k = 1; k < word.length(); k++){
            if ( i >= A.length){
                return false;
            }
            else if(word.charAt(k) != A[i][j]){
                return false;
            }
            i++;
        }
        return true;
        
    }
    public static boolean dirThree(char [][] A , String word, int i, int j){
        // from NW to SE
        i++;
        j++;
        for(int k = 1; k < word.length(); k++){
            if ( i >= A.length || j >= A.length){
                return false;
            }
            else if(word.charAt(k) != A[i][j]){
                return false;
            }
            i++;
            j++;
        }
        return true;
    }
    public static boolean dirFour(char [][] A , String word, int i, int j){
         // from NE to SW
        i++;
        j--;
        for(int k = 1; k < word.length(); k++){
            if ( i >= A.length || j < 0){
                return false;
            }
            else if(word.charAt(k) != A[i][j]){
                return false;
            }
            i++;
            j--;
        }
        return true;
        
    }
    
    
    public static boolean findIn4Dir(char [][] A , String word, int i, int j){
        boolean a1 = dirOne(A, word, i, j);
        boolean a2 = dirTwo(A, word, i, j);
        boolean a3 = dirThree(A, word, i, j);
        boolean a4 = dirFour(A, word, i, j);
        
        if(a1 || a2 || a3 || a4){
            return true;
        }
        else{
            return false;
        }
    }
    
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        char [][] A = new char[n][n];
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                A[i][j] = scn.next().charAt(0);
            }
        }
        
        String word = scn.next();
        char firstCh = word.charAt(0);
        boolean ans = false;
        boolean out = false;
        
        for(int i = 0; i < n; i++){
            if(out) break;
            for(int j = 0; j < n; j++){
               if(A[i][j] == firstCh){
                    ans = findIn4Dir(A, word, i, j);
                   if(ans == true){
                       out = true;
                       break;
                   }
               }
            }
        }
        System.out.println(ans);
        
        
    }
}