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
        
        for(int i = 0; i<n; i++){
            int leftMax = arr[i];
            for(int j = i; j >= 0; j--){
                if(arr[j] > leftMax){
                    leftMax = arr[j];
                }
            }
            int rightMax = arr[i];
            for(int j = i; j<n; j++){
                if(arr[j] > rightMax){
                    rightMax = arr[j];
                }
            }
            
            ans += Math.min(leftMax, rightMax) - arr[i];
            
        }
            
            
        System.out.println(ans);
    }
}