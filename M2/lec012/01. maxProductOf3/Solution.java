import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        //1. input
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] arr = new int[n];
        for(int i = 0 ; i < n; i++){
            arr[i] = scn.nextInt();
        }                               // 7 2 1 6 8
        
        //2. sort arr in asc
         for(int i = 1; i < n; i++){
            int j = i-1;
            int val = arr[i];
            while(j >= 0 && arr[j] > val){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = val;
            
            
        }                      // 1 2 6 7 8
        
        // Arrays.sort(arr);
        
        int r1 = arr[0] * arr[1] * arr[n-1];
        int r2 = arr[n-3] * arr[n-2] * arr[n-1] ;
        
        // System.out.println(Math.max(r1, r2));
        if(r1 > r2){
            System.out.println(r1);
        }
        else{
            System.out.println(r2);
        }
        
        
        
    }
}