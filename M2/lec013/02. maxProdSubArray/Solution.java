import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = scn.nextInt();
        }
        
        int ans = arr[0];
        int minPTN = arr[0];
        int maxPTN = arr[0];
        
        for(int i = 1; i < n; i++){
            int currMaxPTN = maxPTN;
            maxPTN = Math.max(arr[i] , Math.max(arr[i] *minPTN ,arr[i] * maxPTN)); 
            minPTN = Math.min(arr[i] , Math.min(arr[i] *minPTN ,arr[i] * currMaxPTN));
            
            if(maxPTN > ans){
                ans = maxPTN;
            } 
        }
        System.out.println(ans);
        
    }
}