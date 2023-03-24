import java.util.*;
class YTVideo{
    String song;
    int views;
    

    YTVideo(String song, int views){
        this.song = song;
        this.views = views;
    }
    void printInfo(){
        System.out.println(song);
        System.out.println(views);
    }
}

class ShortVideo extends YTVideo{
    int time;
    int impressions;

    ShortVideo(String song, int views, int time, int impressions){
        super(song, views);
        this.time = time;
        this.impressions  = impressions;
    }

    void printInfo(){
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