class Phone{

    void calling(){
        System.out.println("Calling...");
    }
}

class Smartphone extends Phone{
    void internet(){
        System.out.println("Internet Working...");
    }
}


public class Main{
    public static void main(String [] args){
        Phone obj = new Phone();
        // obj.calling();

        Smartphone sp = new Smartphone();
        // sp.internet();
        sp.calling();
        // obj.internet();
    }
}