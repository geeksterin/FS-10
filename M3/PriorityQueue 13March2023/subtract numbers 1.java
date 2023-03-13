import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        //write code here
        
        HashSet<Integer> hs = new HashSet<>();
        for(int ele : arr){
            if(ele > 0)
                hs.add(ele);
        }
        
        System.out.println(hs.size());
    }
}