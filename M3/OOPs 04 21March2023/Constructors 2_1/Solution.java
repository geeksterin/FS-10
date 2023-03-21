import java.util.Scanner;

class InstaInfluencer{
    String name;
    int posts;
    int reels;
    boolean blueTick;
    int followers;
    int following;
    String category;
    char gender;

    InstaInfluencer(String name, int posts, int reels, boolean blueTick, int followers, int following, String category, char gender){
        this.name = name;
        this.posts = posts;
        this.reels = reels;
        this.blueTick = blueTick;
        this.followers = followers;
        this.following = following;
        this.category = category;
        this.gender = gender;
    }

    void printInfo(){
        System.out.println(name);
        System.out.println(posts);
        System.out.println(reels);
        System.out.println(blueTick);
        System.out.println(followers);
        System.out.println(following);
        System.out.println(category);
        System.out.println(gender);

    }

}


public class Solution{
    public static void main(String [] args){
        Scanner scn = new Scanner(System.in);
        String name = scn.nextLine();
        int posts = scn.nextInt();
        int reels = scn.nextInt();
        boolean blueTick = scn.nextBoolean();
        int followers = scn.nextInt();
        int following = scn.nextInt();
        String category = scn.next();
        char gender = scn.next().charAt(0);



        InstaInfluencer i1 = new InstaInfluencer(name, posts, reels, blueTick, followers, following, category, gender);
        i1.printInfo();
        
    }
}