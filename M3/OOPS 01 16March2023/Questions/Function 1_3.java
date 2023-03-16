import java.io.*;
import java.util.*;



class Movies{
    String name;
    int ratings;
    int moneyCol;
    int profit;
    String actor;
    String actress;
    
    // param cons.
    Movies(String n, int r, int mc, int p, String actr, String actrs){
        name = n;
        ratings = r;
        moneyCol = mc;
        profit = p;
        actor = actr;
        actress = actrs;
    }

    void printData(){
        System.out.println(name);
        System.out.println(ratings);
        System.out.println(moneyCol);
        System.out.println(profit);
        System.out.println(actor);
        System.out.println(actress);
    }
    
}


public class Solution {

    public static void main(String[] args) {
        Movies obj1 = new Movies("Batman 1",8, 200000, 5000, "Rachel Gupta & Nikhil Chinapa", "Disha" );
        Movies obj2 = new Movies("Batman 2",9, 500000, 8000, "Rannvijay Singha & Prince Narula", "Neha Dhupia" );
        Movies obj3 = new Movies("Batman 3",10, 700000, 6000, "Rachel Gupta & Prince Narula", "Neha Dhupia" );
        
        //printing details of obj1
        obj1.printData();
        //printing details of obj2
        obj2.printData();
        //printing details of obj3
        obj3.printData();
        
        
    }
}