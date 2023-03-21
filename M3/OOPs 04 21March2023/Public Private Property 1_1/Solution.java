import java.io.*;
import java.util.*;



class Movies{
    public String name;
    public int rating;
    public int moneyCol;
    public int profit;
    public  String actor;
    public String actress;
    private int likes;
    private int views;

    public void displayViews(){
        System.out.println(views);
    }
    public void displayLikes(){
        System.out.println(likes);
    }

    public Movies(String name, int rating, int moneyCol, int profit, String actor, String actress, int likes, int views){
        this.name = name;
        this.rating = rating;
        this.moneyCol = moneyCol;
        this.profit = profit;
        this.actor = actor;
        this.actress = actress;
        this.likes = likes;
        this.views = views;
    }
}


public class Solution {

    public static void main(String[] args) {
        Movies obj = new Movies("Superman 1", 8, 90000, 1000, "Rachel Gupta and Prince Narula", "Aarushi", 500, 10000);
        System.out.println(obj.rating);
        System.out.println(obj.moneyCol);
        System.out.println(obj.profit);
        System.out.println(obj.actor);
        System.out.println(obj.actress);

        obj.displayViews();
        obj.displayLikes();
    }
}