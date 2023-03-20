/*
Static Block
1. It will get executed before any thing
2. Use: to establish the connection with database before starting application
*/
public class StaticBlock{
    
    public static void main(String [] args){
    //     // System.out.println("Hi from main function");

    //     // I want to insert in the database;
    }
    static{
        System.out.println("Hi from static block");
        // To establish the connection  with database I can use static block;
    }

}