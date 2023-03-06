import java.io.*;
import java.util.*;

public class Solution {
    public static boolean isPrime(int element){
        for(int i = 2; i<element; i++){
            if(element % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = scn.nextInt();
        }
        
        for(int i = 0; i<n; i++){
            if(isPrime(arr[i])){
                System.out.print(arr[i]+" ");
            }
        }
    }
}