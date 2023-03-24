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

    //Constructor 1
    YTVideo(String song, String artist, int views, int likes){
        this.song = song;
        this.artist = artist;
        this.views = views; 
        this.likes = likes;
        System.out.println("The song has just released");
    }
    //Constructor 2
    YTVideo(String song, String artist, int views, int likes, int year){
        this.song = song;
        this.artist = artist;
        this.views = views; 
        this.likes = likes;
        this.year = year;
        System.out.println("The song was released in " + year);
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
            
        int k = scn.nextInt();
        if(k == 1){
            //call constructor 1
            YTVideo obj = new YTVideo(s, art, views, likes);
        }
        else{
            //call constructor 2
            YTVideo obj = new YTVideo(s, art, views, likes, year);

        }

        
    }
    
}