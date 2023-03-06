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
        int k = scn.nextInt();
        
        for(int i =0; i<n; i++){
            for(int j = 0; j<n; j++){
                if(arr[i] + arr[j] == k){
                    System.out.println(arr[i] + " " + arr[j]);
                }
            }
        }
    }
}