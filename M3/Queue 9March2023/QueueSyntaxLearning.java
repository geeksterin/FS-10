import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        // Queue<Integer> qu = new ArrayDeque();
        // Queue<Integer> qu = new PriorityQueue();
        Queue<Integer> qu = new LinkedList();
        
        int t = scn.nextInt();
        
        for(int i = 0; i < t; i++){
            int q = scn.nextInt();
            
            if(q == 1){
                System.out.println(qu.size());
            }
            else if(q == 2){
                if(qu.size() == 0){
                    System.out.println(-1);
                }
                else{
                    qu.remove();
                }
            }
            else if(q == 3){
                int x = scn.nextInt();
                qu.add(x);
            }
            else{
                 if(qu.size() == 0){
                    System.out.println(-1);
                }
                else{
                    System.out.println(qu.peek());
                }
            }
        }
        
        
        
        
        
        
    }
}