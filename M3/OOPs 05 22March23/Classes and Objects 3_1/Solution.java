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

    void printInfo(){
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
        
        YTVideo obj = new YTVideo(s,art, views, likes, year, n, comments);
        obj.printInfo();
    }
}