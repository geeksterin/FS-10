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
        
        int ans = Integer.MIN_VALUE;        //== -infinity
        int sumTillNow = 0;
        
        for(int i = 0; i < n; i++){
            //attach to previous sub array
            if(sumTillNow >= 0){
                sumTillNow += arr[i];
            }
            else{
                //start my new sub array
                sumTillNow = arr[i];
            }
            
            if(sumTillNow > ans){
                ans = sumTillNow;
            } 
        }
        System.out.println(ans);
        
    }
}