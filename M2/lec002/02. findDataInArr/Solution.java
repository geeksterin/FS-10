import java.io.*;
import java.util.*;

public class Solution {
    //linear search
    public static boolean isDataPresent(int [] arr, int data){
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == data){
                return true;
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] arr = new int[n];
        
        for(int i = 0; i<n; i++){
            arr[i] = scn.nextInt();
        }
        
        int data = scn.nextInt();
        boolean ans = isDataPresent(arr, data);
        if(ans){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}