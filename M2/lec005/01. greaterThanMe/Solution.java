import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();  //size
        int [] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = scn.nextInt();         // 1 2 3 4 5
        }
        
        for(int i = 0; i<n; i++){
            int count = 0;
            for(int j = 0; j<n; j++){
                if(arr[j] > arr[i]){
                    count++;
                }
            }
            System.out.print(count+" ");
        }
    }
}