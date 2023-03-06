import java.io.*;
import java.util.*;

public class Solution {
    public static boolean isIdentical(int [] arr1, int [] arr2){
        //main logic
        int n = arr1.length;
        int m = arr2.length;
        
        if(n != m){
            return false;
        }
        
        for(int i = 0; i<n; i++){
            if(arr1[i] != arr2[i]){
                return false;
            }
        }
        
        return true;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();  //size of first arr
        int [] arr1 = new int[n];
        
        for(int i = 0; i < n; i++){
            arr1[i] = scn.nextInt();
        }
        
        int m = scn.nextInt();  //size of second arr
        int [] arr2 = new int[m];
        
        for(int i = 0; i<m; i++){
            arr2[i] = scn.nextInt();
        }
        
        boolean ans = isIdentical(arr1, arr2);
        System.out.println(ans);
        
    }
}