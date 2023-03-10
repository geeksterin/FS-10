import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        int [] A = new int[n];
        
        for(int i = 0; i < n; i++){
            A[i] = scn.nextInt();
        }
        
        Queue<Integer> qu = new LinkedList();
        //adding index to the queue
        int i = 0;
        
        while(i < k){
            if(A[i] < 0){
                qu.add(i);
            }
            i++;
        }
        
        while(i < n){
            //ans for previous window
            if(qu.size() == 0){
                System.out.print(0 + " ");
            }
            else{
                 System.out.print(A[qu.peek()] + " ");
            }
            
            //check and remove if needed
            while(qu.size() != 0 && qu.peek() < i-k+1){
                qu.remove();
            }
            
            //add for negative value
            if(A[i] < 0){
                qu.add(i);
            }
            i++;
            
        }
        if(qu.size() == 0){
            System.out.print(0 + " ");
        }
        else{
            System.out.print(A[qu.peek()] + " ");
        }
        
        
    }
}