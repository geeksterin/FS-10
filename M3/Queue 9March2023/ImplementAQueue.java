import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int [] qu = new int[100000];
        int front  = 0;
        int rear = 0;
        
        
        
        
        int t = scn.nextInt();
        
        
        for(int i = 0; i < t; i++){
            String q = scn.next();
            
            if(q.equals("enqueue")){
                int x = scn.nextInt();
                qu[rear] = x;
                rear++;
            }
            else if(q.equals("dequeue")){
                if(front != rear)
                    front++;
            }
            else if(q.equals("size")){
                System.out.println(rear-front);
            }
            else{
                //print
                for(int j = front; j < rear; j++){
                    System.out.print(qu[j] + " ");
                }
                System.out.println();
            }
            
        }
        
    }
}