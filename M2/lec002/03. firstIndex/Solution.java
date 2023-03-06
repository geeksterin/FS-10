import java.io.*;
import java.util.*;

public class Solution {
    public static int isDataPresent(int [] arr, int data){
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == data){
                return i;
            }
        }
        
        return -1;
    }
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] arr = new int[n];
        
        for(int i = 0; i<n; i++){
            arr[i] = scn.nextInt();
        }
        
        int data = scn.nextInt();
        int ans = isDataPresent(arr, data);
        System.out.println(ans);
    }
}