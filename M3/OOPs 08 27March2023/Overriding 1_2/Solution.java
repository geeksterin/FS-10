class Movies{
    public String name;
    public int rating;
    public int moneyCol;
    public int profit;
    public String actor;
    public String actress;

    public void displayRating(){
        System.out.println(rating);
        System.out.println("This is the function of movies class.");
    }

}

class ComMovies extends Movies{
    public int views;
    public int likes;

    public void displayRating(){
        System.out.println(rating);
        System.out.println("This is the function of the commercial movies class.");   
    }

}


public class Solution{
    public static void main(String [] args){
        ComMovies obj = new ComMovies();
        obj.song = "London Dream";
        obj.rating = 10;
        obj.moneyCol = 9000000;
        obj.profit = 70000000;
        obj.actor = "Salman Khan";
        obj.actress = "Asin";
        obj.views = 10000;
        obj.likes = 500;


        Movies obj3 = new Movies;
        obj3.displayRating();

        obj.displayRating();


    }
}