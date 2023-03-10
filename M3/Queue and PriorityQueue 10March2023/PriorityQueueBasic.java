import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        PriorityQueue<Integer> pq = new PriorityQueue();            //min
        
        // PriorityQueue<Integer> pq = new PriorityQueue(Collections.reverseOrder());   //max
        
        int t = scn.nextInt();
        
        for(int i = 0; i < t; i++){
            int x = scn.nextInt();
            
            //add
            pq.add(x);
            System.out.println(pq.peek());
            
        }
    }
}