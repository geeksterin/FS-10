import java.io.*;
import java.util.*;

public class Solution {
    public static int sumArr(int [] arr){
        int sum = 0;
        for(int i = 0; i<n; i++){
            int ele = arr[i];
            sum += ele;
        }
        
//         for(int ele : arr){
//             sum += ele;
//         }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] arr = new int[n];
        
        for(int i = 0; i<n; i++){
            arr[i] = scn.nextInt();
        }
        
        int sum = sumArr(arr);
        for(int i = 0; i<n; i++){
            System.out.println(sum-arr[i]);
        }
        
    }
}