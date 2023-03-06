import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = scn.nextInt();
        }
        
        int ans = 0;
        int maxFreq = 0;
        
        for(int i =0; i<n; i++){
            int currVal = arr[i];
            int currFreq = 0;
            for(int j = 0; j<n; j++){
                if(arr[j] == currVal){
                    currFreq++;
                }
            }
            if(currFreq > maxFreq){
                ans = currVal;
                maxFreq = currFreq;
            }
            
        }
        System.out.println(ans);
        
        
    }
}