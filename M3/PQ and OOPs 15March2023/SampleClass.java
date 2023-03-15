class Car{
    //properties --> data members
    String carName;
    int topSpeed;
    String color;

    // related function --> member function
    public void engineStart(){
        System.out.println(this.carName +" is Starting");
    }
    public void move(){
        System.out.println("Car is Moving");
    }
    public void brake(){
        System.out.println("Car stopped");
    }

}

public class SampleClass{
    public static void main(String [] args){
        Car alto = new Car();
        alto.carName = "Alto";
        alto.topSpeed = 80;
        alto.color = "white";

        Car city = new Car();
        city.carName = "City";
        city.topSpeed = 140;
        city.color = "Silver";


        alto.engineStart();
        city.engineStart();
    }
}