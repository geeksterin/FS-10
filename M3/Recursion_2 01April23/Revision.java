public class Revision{
    public static void print1N(int n){
        if(n == 0)
            return;
        
        print1N(n-1);
        System.out.println(n);
    }
    public static void printN1(int n){
        if(n == 0)
            return;
        
        System.out.println(n);
        print1N(n-1);
    }
 public static void printEven1toN(int n){
    if(n == 0){
        return;
    }
    printEven1toN(n-2);
    System.out.println(n);
 }   
    public static void printAltReverseEle(int [] A, int idx){
        if(idx >= A.length)
            return;

        System.out.println(A[A.length - idx - 1]);
        printAltReverseEle(A, idx + 2);
    }



    public static void main(String [] args){
        // int n = 12;
        // n = n - n % 2;  //n = 8
        // printEven1toN(n);

        int idx = 0;
        int [] A = {2,4,6,8,10,12};
        printAltReverseEle(A, idx);

    }
}