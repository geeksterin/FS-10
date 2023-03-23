import java.io.*;
import java.util.*;


class YTVideo{
    String song;
    String artist;
    int views;
    int likes;
    int year;
    int commentsCount;  //n
    ArrayList<String> comments;
    static int countObj;

    YTVideo(String song, String artist, int views, int likes, int year, int commentsCount, ArrayList<String> comments){
        this.song = song;
        this.artist = artist;
        this.views = views; 
        this.likes = likes;
        this.year = year;
        this.commentsCount = commentsCount;
        this.comments = comments;
        countObj++;
    }

}



public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int M = scn.nextInt();
        scn.nextLine();


        for(int t = 0; t < M; t++){

            String s = scn.nextLine();
            String art = scn.nextLine();
            int views = scn.nextInt();
            int likes = scn.nextInt();
            int year = scn.nextInt();
            int n = scn.nextInt();
            scn.nextLine();
            ArrayList<String> comments = new ArrayList<>();
            for(int i = 0; i < n; i++){
                String com = scn.nextLine();
                comments.add(com);
            }
            
            YTVideo obj = new YTVideo(s,art, views, likes, year, n, comments);

        }
        System.out.println(YTVideo.countObj);

        
    }
    
}