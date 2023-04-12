public class PremiumPizza extends Pizza{

    public PremiumPizza(boolean isVeg){
        super(isVeg);
        super.addExtraCheese();
        super.addExtraTopping();
    }

    public void addExtraTopping(){
        System.out.println("***!Warning*** -> Extra Topping Already added");
    }

    public void addExtraCheese(){
        System.out.println("***!Warning*** -> Extra Cheese Already added");
    }

    //Task1: Over Ride calculateTax() // 18%
    



    // Task 2 --> override generateBill()


}