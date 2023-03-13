import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int k = scn.nextInt();
        
        PriorityQueue<Integer> pq = new PriorityQueue();    //min pq
        
        while(k-- > 0){
            int n = scn.nextInt();
            int [] arr = new int[n];
            for(int i = 0; i < n; i++){
                arr[i] = scn.nextInt();
            }
            for(int ele : arr )
                pq.add(ele);
        }
        
        while(pq.size() != 0){
            System.out.print(pq.remove() + " ");
        }
        
    }
}