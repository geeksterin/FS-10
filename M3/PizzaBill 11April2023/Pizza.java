public class Pizza{
    private int price;
    private boolean isVeg;      //default false

    private int extraToppingCost = 99;
    private int extraCheeseCost = 79;
    private int packingCharges = 39;



    public Pizza(boolean isVeg){
        this.isVeg = isVeg;
        if(isVeg){
            price += 299;
        }
        else{
            price += 399;
        }
    }

    public void printPrice(){
        System.out.println("Pizza Price: " + this.price);
    }

    public void addExtraTopping(){
        this.price += extraToppingCost;
    }

    public void addExtraCheese(){
        this.price += extraCheeseCost;
        
    }

    public void packFood(){
        this.price += packingCharges;
    }

}