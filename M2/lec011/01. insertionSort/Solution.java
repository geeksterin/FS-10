import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] arr = new int[n];
        for(int i = 0 ; i < n; i++){
            arr[i] = scn.nextInt();
        }
        
        //insertion sort
        for(int i = 1; i < n; i++){
            int j = i-1;
            int val = arr[i];
            while(j >= 0 && arr[j] > val){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = val;
            
            
        }
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        
    }
}