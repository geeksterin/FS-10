class Movies{
    public String name;
    private int year;

    public void setYear(int y){
        System.out.println("I am setting year");
        year = y;
    }

    public void printYear(){
        System.out.println(year);
    }

}

public class Main{
    public static void main(String [] args){
        Movies obj = new Movies();
        obj.name = "Batman1";
        obj.setYear(1920);
        System.out.println(obj.name);
        obj.printYear();
    }
}