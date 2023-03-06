import java.io.*;
import java.util.*;

public class Solution {
    public static int firstVowel(char [] arr){
        for(int i = 0; i<arr.length; i++){
            char ch = arr[i];
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        char [] arr = new char[n];
        for(int i = 0; i < n; i++){
            arr[i] = scn.next().charAt(0);
        }
        int ans = firstVowel(arr);
        System.out.println(ans);
        
    }
}