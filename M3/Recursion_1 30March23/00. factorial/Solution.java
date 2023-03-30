
public class Solution{

    
    public static int factorial(int n){
        if(n == 0)
            return 1;
        int prevAns = factorial(n-1);
        int myAns = n * prevAns;
        return myAns;
    }

    public static int factorial(int n){
        return n==0?1: factorial(n-1);
    }


    public static void main(String [] args){
        int n = 10;

        int ans = factorial(n);
        System.out.println(ans);

    }
}