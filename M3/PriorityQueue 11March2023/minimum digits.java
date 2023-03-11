import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        PriorityQueue<Integer> pq = new PriorityQueue();
        while(n-- > 0){
            int x = scn.nextInt();
            pq.add(x);
        }
        
        String a = "";
        String b = "";
        
        int i = 0;
        while(pq.size() != 0){
            if(i % 2 == 0){
                a += pq.remove();
            }
            else{
                b += pq.remove();
            }
            i++;
        }
        
        Long aVal = Long.parseLong(a);
        Long bVal = Long.parseLong(b);
        
        System.out.println(aVal + bVal);
    }
}