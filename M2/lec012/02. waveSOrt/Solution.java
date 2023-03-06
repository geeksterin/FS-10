import java.io.*;
import java.util.*;

public class Solution {
    
    
    public static void main(String[] args) {
         Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] arr = new int[n];
        for(int i =0; i < arr.length; i++){
            arr[i] = scn.nextInt();
        }
        
        Arrays.sort(arr);
        
        for(int i = 0 ; i < n-1 ; i += 2){
           int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
        for(int i = 0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        
    }
}