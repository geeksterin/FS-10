import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'runningMedian' function below.
     *
     * The function is expected to return a DOUBLE_ARRAY.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static List<Double> runningMedian(List<Integer> a) {
        List<Double> ans = new ArrayList<>();
        PriorityQueue<Integer> p1 = new PriorityQueue(Collections.reverseOrder());      //p1->max pq
        PriorityQueue<Integer> p2 = new PriorityQueue();                                //p2->min pq
        
        for(int i = 0; i < a.size(); i++){
            int ele = a.get(i);
            
            
            //add
            if(i == 0 || p1.peek() > ele){
                p1.add(ele);
            }
            else{
                p2.add(ele);
            }
            
            //check diff
            int d = Math.abs(p1.size() - p2.size());
            if(d > 1){
                if(p1.size() > p2.size()){
                    int rem = p1.remove();
                    p2.add(rem);
                }
                else{
                    int rem = p2.remove();
                    p1.add(rem);
                }
            }
            
            // find median
            if(p1.size() == p2.size()){
                int x = p1.peek();
                int y = p2.peek();
                
                Double avg = (x + y) / 2.0;
                ans.add(avg);
            }
            else{
                if(p1.size() > p2.size()){
                    Double x = p1.peek() * 1.0;
                    ans.add(x);
                    
                }
                else{
                    Double x = p2.peek() * 1.0;
                    ans.add(x);
                }
            }
            
            
        }
        
        
        
        
        return ans;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int aCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> a = IntStream.range(0, aCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .map(String::trim)
            .map(Integer::parseInt)
            .collect(toList());

        List<Double> result = Result.runningMedian(a);

        bufferedWriter.write(
            result.stream()
                .map(Object::toString)
                .collect(joining("\n"))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
