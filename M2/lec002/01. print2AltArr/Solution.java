import java.io.*;
import java.util.*;

public class Solution {
    public static void printAltArr(int [] A, int [] B){
        for(int i = 0; i < A.length; i++){
            if(i % 2 == 0){
                System.out.print(A[i] + " ");
            }
            else{
                System.out.print(B[i] + " ");
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int [] A = new int[n];
        int [] B = new int[n];
        
        for(int i = 0; i<n; i++){
            A[i] = scn.nextInt();    
        }
        for(int i = 0; i<n; i++){
            B[i] = scn.nextInt();    
        }
        
        printAltArr(A,B);

    }
}