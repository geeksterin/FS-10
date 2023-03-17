import java.util.*;
class Movies{
    String name;
    int rating;
    int moneyCol;
    int profit;
    String actor;
    String actress;

    Movies(int r, int m){
        System.out.println("Stored rating and money.");
        this.rating = r;
        this.moneyCol = moneyCol;
    }

}



public class Main{
    public static void main(String [] args){
        
        
        Movies  Superman1 = new Movies(8, 900000);
        Movies  Superman2 = new Movies(10, 800000);
        System.out.println(Superman1.rating);
        System.out.println(Superman2.rating);
        
        

    }
}