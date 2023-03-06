import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] A = new int[n];
        for(int i = 0; i < n; i++){
            A[i] = scn.nextInt();
        }
        int m = scn.nextInt();
        int [] B = new int[m];
        for(int i = 0; i < m; i++){
            B[i] = scn.nextInt();
        }
        
        //1. to make a new array of size n + m
        int [] ans = new int[n+m];
        int i = 0, j = 0, k = 0;
        
        while(i < n && j < m){
            if(A[i] < B[j]){
                ans[k] = A[i];
                i++;
                k++;
            }
            else{
                ans[k] = B[j];
                j++;
                k++;
            }
        }
        while(i < n){
            ans[k] = A[i];
            i++;
            k++;
        }
        while(j < m){
            ans[k] = B[j];
            j++;
            k++;
        }
        
        for(i = 0; i < n+m; i++){
            System.out.print(ans[i]+ " ");
        }
        
        
        
        
    }
}