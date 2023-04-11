public class Pizza{
    private int price;
    private boolean isVeg;      //default false
    private int basePrice;

    private int extraToppingCost = 99;
    private int extraCheeseCost = 79;
    private int packingCharges = 39;

    private boolean extraToppingAdded;      //true
    private boolean extraCheeseAdded;
    private boolean foodPacked;




    public Pizza(boolean isVeg){
        this.isVeg = isVeg;
        if(isVeg){
            basePrice = 299;
        }
        else{
            basePrice = 399;
        }
        price += basePrice;
    }

    public void generateBill(){
        double taxApplied = calculateTax();

        System.out.println("<------Pizza Bill------>");
        StringBuilder sb = new StringBuilder();
        sb.append("Base Price : ");
        sb.append(basePrice);
       
       
        if(extraToppingAdded){
            sb.append("\nExtra Topping Cost : ");
            sb.append(extraToppingCost);
        }
        if(extraCheeseAdded){
            sb.append("\nExtra Cheese Cost : ");
            sb.append(extraCheeseCost);
        }
        if(foodPacked){
            sb.append("\nPacking Cost : ");
            sb.append(packingCharges);
        }
        sb.append("\nTotal Amount without tax : " + price);
        sb.append("\nTax : " + taxApplied);
        sb.append("\nAmount Payable : ");
        sb.append(price + taxApplied);
        sb.append("\nEnjoy your meal !!");


        System.out.println(sb);
    }

    public void addExtraTopping(){
        extraToppingAdded = true;
        this.price += extraToppingCost;
    }

    public void addExtraCheese(){
        extraCheeseAdded = true;
        this.price += extraCheeseCost;
        
    }

    public void packFood(){
        foodPacked = true;
        this.price += packingCharges;
    }

    public double calculateTax(){
        //12 % 
        double tax = (0.12 * price);
        return tax;
    }

}