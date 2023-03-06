import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] arr = new int[n];
        
        //ip
        for(int i = 0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        
        //print odd
        for(int i = 0; i<arr.length; i++){
            if(arr[i] % 2 != 0){
                System.out.print(arr[i] + " ");
            }
        }
    }
}