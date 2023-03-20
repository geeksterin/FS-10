/*
Static Method
1. Static methods can be called without creating obj
2. static method can only call directly another static method

*/
class Movies{
    public static void sayHiWithStatic(){
        System.out.println("Hi from static method inside class Movies");
    }
    public void sayHiWithoutStatic(){
        System.out.println("Hi from non static method inside class Movies");
    }

}
public class StaticMethod{

    public static void sayHiWithStatic(){
        System.out.println("Hi from static method");
    }
    public void sayHiWithoutStatic(){
        System.out.println("Hi from non static method");
    }
    
    public static void main(String [] args){
        // sayHiWithStatic();
        // sayHiWithoutStatic();
        Movies obj = new Movies();
        // obj.sayHiWithoutStatic();

        StaticMethod smo = new StaticMethod();
        smo.sayHiWithoutStatic();
        // Movies.sayHiWithStatic();


    }
    

}