import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Queue<String> qu = new LinkedList();
        qu.add("1");
        
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        for(int i = 0; i < n; i++){
            String rem = qu.remove();
            System.out.print(rem + " ");
            
            //add 2 more
            qu.add(rem + "0");
            qu.add(rem + "1");
        }
        
        
    }
}