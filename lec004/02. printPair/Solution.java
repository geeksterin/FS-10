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
        
        for(int i = 0; i<=n-2; i++){
            for(int j = i+1; j<n; j++){
                System.out.println(arr[i]+" "+arr[j]);
            }
        }
        
    }
}