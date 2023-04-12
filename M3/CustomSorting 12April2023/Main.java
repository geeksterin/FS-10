
import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    //lambda
	   // PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->{
	   //     return a-b;
	   // });
	    
	   // pq.add(10);
	   // pq.add(30);
	   // pq.add(20);
	    
	   // while(pq.size() != 0)
	   // System.out.println(pq.remove());
	    
	    
// 	    Integer [] arr = {5,2,1,3,4};
// 	    Arrays.sort(arr, (a,b) -> {
// 	        return b-a;
// 	    });
// 		for(int ele : arr){
// 		    System.out.println(ele);
// 		}


        int [][] arr  = {{10,5},
                        {30, 4},
                        {20,6}};
                        
        Arrays.sort(arr, (a,b)->{
           return b[1] - a[1]; 
        });
        
        for(int [] d : arr){
            System.out.println(d[0] + " " + d[1]);
        }
	}
}
