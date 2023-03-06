import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       Scanner scn = new Scanner(System.in);
        int n  = scn.nextInt();
        int [] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = scn.nextInt();
        }
        int k = scn.nextInt();
        
        //logic
        for(int i = 0; i <= n-k; i++){
            int maxVal = arr[i];
            for(int j = 1; j<k; j++){
                if(arr[i+j] > maxVal){
                    maxVal = arr[i+j];
                }
            }
            System.out.print(maxVal+" ");
        }
        
    }
}