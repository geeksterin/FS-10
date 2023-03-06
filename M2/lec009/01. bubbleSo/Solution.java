import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] arr = new int[n];
        for(int i =0; i < arr.length; i++){
            arr[i] = scn.nextInt();
        }
        
        
        for(int i = 0; i < n-1; i++){   //iterations
            for(int j = 0; j < n-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
        
        for(int i = 0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        
    }
}