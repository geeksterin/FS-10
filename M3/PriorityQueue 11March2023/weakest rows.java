import java.io.*;
import java.util.*;

public class Solution {
    
    public static int countSoldiers(int [][] A, int row){
        
        return count;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int m = scn.nextInt();
        int n = scn.nextInt();
        int k = scn.nextInt();
        
        int [][] A = new int[m][n];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                A[i][j] = scn.nextInt();
            }
        }
        
        //PQ
        PriorityQueue<Integer> pq = new PriorityQueue();
        
        for(int i = 0; i < m; i++){
            int count = countSoldiers(A, i);        // i-> row
            pq.add(10000*count + i);
        }
        
        while(k-- > 0){
            System.out.print((pq.remove() % 10000 )+ " ");
        }
        
        
        
        
    }
}