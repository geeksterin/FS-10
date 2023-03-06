import java.io.*;
import java.util.*;

public class Solution {
    public static void printArr(int [] arr){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
    }
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = scn.nextInt();
        }
        int left = scn.nextInt();
        int right = scn.nextInt();
        
        int x = scn.nextInt();
        
        // travel in range[l,r]
        for(int i = left; i <= right; i++){
            arr[i] = x;
        }
        printArr(arr);
        
    }
}