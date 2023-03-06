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
        
        for(int st = 0 ; st < n ; st++){
            for(int ed = st; ed < n; ed++){
                for(int k = st; k <= ed; k++){
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
        }
        
    }
}