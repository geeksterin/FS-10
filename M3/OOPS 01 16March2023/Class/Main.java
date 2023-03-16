import java.util.*;

class Human{
    //data members (properties)
    String firstName;
    int age;
    String lastName;

    // Human(String fName, String lName, int a){
    //     System.out.println("I have 3 params "  + fName );
    //     firstName = fName;
    //     age = a;
    //     lastName = lName;
    // }

    Human(){
        firstName = "Robot";
        lastName = "Super";
        age = 2;
    }
    


}

public class Main{
    public static void main(String [] args){
        // Scanner scn = new Scanner(System.in);

        // Human obj1 = new Human();
        // obj1.firstName = "Aman";
        // obj1.age = 82;
        // obj1.lastName = "Srivastava";


        // Human obj1 = new Human("Aman", "Srivastava", 82);
        // Human obj2 = new Human("Ravi","Lohar", 22);
        Human obj3 = new Human();
        // Human obj2 = new Human();
        // obj2.firstName = "Ravi";
        // obj2.age = 22;
        // obj2.lastName = "Lohar";


        System.out.println(obj1.firstName);
        System.out.println(obj1.lastName);
        System.out.println(obj1.age);

        System.out.println(obj2.firstName);
        System.out.println(obj2.lastName);
        System.out.println(obj2.age);

        System.out.println(obj3.firstName);
        System.out.println(obj3.lastName);
        System.out.println(obj3.age);

    }
}