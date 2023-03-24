import java.util.*;
class YTVideo{
    String song;
    String artist;
    int views;
    int likes;
    int year;
    int commentsCount;  //n
    ArrayList<String> comments;

    YTVideo(String song, String artist, int views, int likes, int year, int commentsCount, ArrayList<String> comments){
        this.song = song;
        this.artist = artist;
        this.views = views;
        this.likes = likes;
        this.year = year;
        this.commentsCount = commentsCount;
        this.comments = comments;
    }
    void printInfoYT(){
        System.out.println(song);
        System.out.println(artist);
        System.out.println(views);
        System.out.println(likes);
        System.out.println(year);
        System.out.println(commentsCount);
        for(String ele : comments){
            System.out.println(ele);
        }
    }
}

class ShortVideo extends YTVideo{
    int time;
    int impressions;

    ShortVideo(String song, String artist, int views, int likes, int year, int commentsCount, ArrayList<String> comments, int time, int impressions){
        super(song, artist, views, likes, year, commentsCount, comments);
        this.time = time;
        this.impressions  = impressions;
    }

    void printInfoSV(){
        System.out.println(time);
        System.out.println(impressions);
    }
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

        int time = scn.nextInt();
        int impressions = scn.nextInt();


        ShortVideo sv = new ShortVideo(song, artist, views, likes, year, commentsCount, comments, time, impressions);
        sv.printInfoYT();
        sv.printInfoSV();

    }
}