import java.util.*;
class Movies{
    String name;
    int rating;
    int moneyCol;
    int profit;
    String actor;
    String actress;
    // static String videoType = "movies";
    static String videoType;
    
    Movies(int r, int m, int p, String la, String lac){
        rating = r;
        moneyCol = m;
        profit = p;
        actor = la;
        actress = lac;
    }

}



public class Solution{
    
    static {
        Movies.videoType = "movies";
    }
    
    public static void main(String [] args){
        
        Movies  Superman1 = new Movies(8, 90000, 8000, "Rachel Gupta", "Vaani");
        
        System.out.println(Superman1.videoType);
        System.out.println(Movies.videoType);
        

    }
}