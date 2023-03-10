import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        PriorityQueue<Integer> pq = new PriorityQueue(Collections.reverseOrder());          //max
        
        int n = scn.nextInt();
        
        while(n-- > 0){
            int x = scn.nextInt();
            pq.add(x);
        }
        
        while(pq.size() > 1){
            int y = pq.remove();    //8
            int x = pq.remove();    //7
            
            int res = y-x;
            if(res != 0)
                pq.add(res);
            
        }
        if(pq.size() == 0){
           System.out.println(0); 
        }else{
            System.out.println(pq.peek()); 
        }
        
        
    }
}