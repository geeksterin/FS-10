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
        rating = r;
        moneyCol = m;

        profit = 90;
        actor = "Salman";
        actress = "Deepika";
        name = "TaraSitara";
    }
    Movies(int r, int m, int p){
        System.out.println("Stored rating, money, profit are given.");
        rating = r;
        moneyCol = m;
        profit = p;
    }
    Movies(int r, int m, int p, String la){
        System.out.println("Stored rating, money, profit, lead actors are given.");
        rating = r;
        moneyCol = m;
        profit = p;
        actor = la;
    }

    Movies(int r, int m, int p, String la, String lac, String n){
        System.out.println("Stored rating, money, profit, lead actors are given.");
        rating = r;
        moneyCol = m;
        profit = p;
        actor = la;
        actress = lac;
        name = n;
    }

}



public class Main{
    public static void main(String [] args){
        
        
        Movies  Superman1 = new Movies(8, 900000);
        System.out.println(Superman1.name);
        Movies  Superman2 = new Movies(8, 900000, 8000);
        Movies  Superman3 = new Movies(8, 900000, 8000, "Ranveer Singh", "Deepika", "TaraSitara" );

    }
}