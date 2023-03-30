
public class Solution{

    public static int power(int x, int n){
        if(n == 0)
            return 1;
        
        int prevAns = power(x, n-1);
        int myAns = prevAns * x;
        return myAns;
    }


    public static void main(String [] args){
        int x = 2;
        int n = 3;

        int ans = power(x,n);
        System.out.println(ans);

    }
}