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

    public double calculateTax(){
        //18 % 
        double tax = (0.18 * price);
        return tax;
    }


}