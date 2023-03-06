import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int [] arr = new int[n];
        
        //arr ip
        for(int i = 0; i<n; i++){
            arr[i] = scn.nextInt();
        }
        
        //print alt
        for(int i = 0; i<n; i += 2){
            System.out.println(arr[i]);
        }
        
    }
}