import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        int n = scn.nextInt();
        
        //init arr
        int [] arr = new int[n];
        
        for(int i = 0; i<n; i++){
            arr[i] = scn.nextInt();
        }
        
        // print it
        for(int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
        
    }
}