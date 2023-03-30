
public class Solution{

    public static void wishes(){
        System.out.println("Good Evening");


    }
    public static void sayHi(){
        System.out.println("I am inside sayHi Function");
        wishes();
        System.out.println("Hi");

    }


    public static void main(String [] args){
        System.out.println("Inside Main Funciton");
        sayHi();
        System.out.println("Ending Main Funciton");
    }
}