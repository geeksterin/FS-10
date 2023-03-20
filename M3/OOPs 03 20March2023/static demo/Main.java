// static variable:
/*
1. Common for all objects
2. All objects share common memory
3. Property of Class
4. Used as global variable
*/

class Movies{
    static int revenue;

    String name;
    int moneyCol;


    Movies(String n, int mc){
        name = n;
        moneyCol = mc;
    }

    void addRevenue(){
        revenue += moneyCol;
    }
}

public class Main
{
    static int age;
	public static void main(String[] args) {
        Movies obj1 = new Movies("Batman1", 400);
        Movies obj2 = new Movies("Batman2", 500);

        // obj1.addRevenue();
        // obj2.addRevenue();

        Movies.revenue += obj1.moneyCol;
        Movies.revenue += obj2.moneyCol;

        age = 10;


        // obj1.name = "B1";
        // Movies.revenue = 10;
		System.out.println("Revenue is : " + Movies.revenue);
		// System.out.println("Revenue is : " + Movies.revenue);
	}
}