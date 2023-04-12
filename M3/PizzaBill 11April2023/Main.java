public class Main{
    public static void main(String [] args){
        Pizza p1 = new Pizza(true); //true  means veg Pizza
        p1.addExtraCheese();
        p1.addExtraTopping();
        p1.packFood();
        p1.generateBill();

        // p1.generateBill();

        // PremiumPizza p2 = new PremiumPizza(true);
        // // p2.addExtraCheese();
        // // p2.packFood();       // --> Optional
        // p2.generateBill();
        // p2.printBill();
    }
}