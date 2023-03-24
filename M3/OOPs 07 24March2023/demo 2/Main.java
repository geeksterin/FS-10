class Phone{
    int x;
    int y;

    Phone(){

    }
    Phone(int x, int y){

        this.x = x;
        this.y = y;
    Phone(int x, int y, int z){

        this.x = x;
        this.y = y;
    }
    
}

class Smartphone extends Phone{
    int a;
    int b;

    Smartphone(int a, int b, int x, int y){
        super();
        super(x,y);
        super(x,y,z);
        this.a = a;
        this.b = b;
    }
}


public class Main{
    public static void main(String [] args){
        Smartphone obj = new Smartphone(10,20,30,40);
    }
}