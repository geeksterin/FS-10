
class InstaInfluencer{
    String name;
    int posts;
    int reels;
    String blueTick;
    int followers;
    int following;
    String category;
    char gender;

    InstaInfluencer(String name, int posts, int reels, String blueTick, int followers, int following, String category, char gender){
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
        InstaInfluencer i1 = new InstaInfluencer("Raftaar", 340, 400, "Yes", 7, 200, "Rapper", 'M');
        InstaInfluencer i2 = new InstaInfluencer("Rachel Gupta", 550, 350, "Yes", 15, 10, "Artist", 'M');
        InstaInfluencer i3 = new InstaInfluencer("Nikhil Chinapa", 500, 220, "Yes", 5, 210, "VJ", 'M');
        InstaInfluencer i4 = new InstaInfluencer("Baseer", 500, 120, "No", 2, 230, "VJ", 'M');


        i1.printInfo();
        i2.printInfo();
        i3.printInfo();
        i4.printInfo();

    }
}