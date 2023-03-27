import java.util.*;

class YTVideo{
    public String song;
    public String artist;
    public int views;
    public int likes;
    public int year;
    public int commentsCount;  //n
    public ArrayList<String> comments;

    public void printTempRank(){
        System.out.println("Method of youtubeVideo class. Also can not find the rank right now.");
    }


}

class ShortVideo extends YTVideo{

}


public class Solution{
    public static void main(String [] args){
        Scanner scn = new Scanner(System.in);
        String song = scn.nextLine();
        String artist = scn.nextLine();
        int views = scn.nextInt();
        int likes = scn.nextInt();
        int year = scn.nextInt();
        int commentsCount = scn.nextInt();
        scn.nextLine();
        ArrayList<String> comments = new ArrayList<>();
        for(int i = 0; i < commentsCount; i++){
            String s = scn.nextLine();
            comments.add(s);
        }
        ShortVideo sv = new ShortVideo();
        sv.printTempRank();

    }
}