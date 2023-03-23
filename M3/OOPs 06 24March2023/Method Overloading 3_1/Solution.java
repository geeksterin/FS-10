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

    YTVideo(String song, String artist, int views, int likes, int year, int commentsCount, ArrayList<String> comments){
        this.song = song;
        this.artist = artist;
        this.views = views;
        this.likes = likes;
        this.year = year;
        this.commentsCount = commentsCount;
        this.comments = comments;
    }

    void add(int x){
        this.views += x;
        System.out.println("Views are added");
        System.out.println(this.views);
        System.out.println(this.likes);

    }
    void add(int x, int y){
        this.views += x;
        this.likes += y;
        System.out.println("Views and likes are added");
        System.out.println(this.views);
        System.out.println(this.likes);

    }

}



public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

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

        YTVideo obj = new YTVideo(s, art, views, likes, year, n, comments);
            
        int k = scn.nextInt();
        if(k == 1){
            // call add(x)
            int x = scn.nextInt();
            obj.add(x);
        }
        else{
            // call add(x,y)
            int x = scn.nextInt();
            int y = scn.nextInt();
            obj.add(x, y);

        }

        
    }
    
}