import java.io.*;
import java.util.*;



class Movies{
    int ratings;
    int moneyCol;
    int profit;
    String actor;
    String actress;
    
    // param cons.
    Movies(int r, int mc, int p, String actr, String actrs){
        ratings = r;
        moneyCol = mc;
        profit = p;
        actor = actr;
        actress = actrs;
    }
    
}


public class Solution {

    public static void main(String[] args) {
        Movies obj1 = new Movies(8, 200000, 5000, "Rachel Gupta & Nikhil Chinapa", "Disha" );
        Movies obj2 = new Movies(9, 500000, 8000, "Rannvijay Singha & Prince Narula", "Neha Dhupia" );
        Movies obj3 = new Movies(10, 700000, 6000, "Rachel Gupta & Prince Narula", "Neha Dhupia" );
        
        //printing details of obj1
        System.out.println(obj1.ratings);
        System.out.println(obj1.moneyCol);
        System.out.println(obj1.profit);
        System.out.println(obj1.actor);
        System.out.println(obj1.actress);
        //printing details of obj2
        System.out.println(obj2.ratings);
        System.out.println(obj2.moneyCol);
        System.out.println(obj2.profit);
        System.out.println(obj2.actor);
        System.out.println(obj2.actress);
        //printing details of obj3
        System.out.println(obj3.ratings);
        System.out.println(obj3.moneyCol);
        System.out.println(obj3.profit);
        System.out.println(obj3.actor);
        System.out.println(obj3.actress);

        
        
    }
}