/*
Name:Batman 1 (String data type)
Rating: 8 (int data-type)
Money Collection: 200,000 (int data-type)
Profit: 5000 (int data-type)
Lead Actor: John (String data-type)
Lead Actress: Disha (String data-type)
All the properties listed above are public.
*/

import java.io.*;
import java.util.*;

class Movies{
    public String name;
    public int rating;
    public int moneyCol;
    public int profit;
    public String actor;
    public String actress;

    Movies(String name, int rating, int moneyCol, int profit, String actor, String actress){
        this.name = name;
        this.rating = rating;
        this.moneyCol = moneyCol;
        this.profit = profit;
        this.actor = actor;
        this.actress = actress;
    }

    public void printInfo(){
        System.out.println(name);
        System.out.println(rating);
        System.out.println(moneyCol);
        System.out.println(profit);
        System.out.println(actor);
        System.out.println(actress);
    }
}

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.nextLine();
        Movies [] arr = new Movies[n];
        for(int i = 0; i < n; i++){
            String name = scn.nextLine();
            int rating = scn.nextInt();
            int moneyCol = scn.nextInt();
            int profit = scn.nextInt();
            scn.nextLine();
            String actor = scn.nextLine();
            String actress = scn.nextLine();
            
//             System.out.println(name);
//         System.out.println(rating);
//         System.out.println(moneyCol);
//         System.out.println(profit);
//         System.out.println(actor);
//         System.out.println(actress);

            Movies obj = new Movies(name, rating, moneyCol, profit, actor, actress);
            arr[i] = obj;
        }

        for(int i = 0; i < n; i++){
            Movies obj = arr[i];
            obj.printInfo();
        }




    



        
    }
}