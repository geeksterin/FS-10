import java.util.*;

class YTVideo{
    public String song;
    public String artist;
    public int views;
    public int likes;
    public int year;
    public int commentsCount;  //n
    public ArrayList<String> comments;
    private int impressions;

    public void getImpressions(){
        System.out.println(impressions);
    }

    private int calcRank(){
        int sum = lieks + impressions;
        if(sum > 10000)
            return 1;
        else if(sum > 5000)
            return 2;
        else if(sum > 1000)
            return 3;
        else if( likes == 0)
            return 4;

        return -1;
    }

    public void printRank(){
        int rank = calcRank();
        System.out.println(rank);
    }


    YTVideo(String song, String artist, int views, int likes, int year, int commentsCount, ArrayList<String> comments, int impressions){
        this.song = song;
        this.artist = artist;
        this.views = views;
        this.likes = likes;
        this.year = year;
        this.commentsCount = commentsCount;
        this.comments = comments;
        this.impressions = impressions;
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
        int impressions = scn.nextInt();


        YTVideo obj = new YTVideo(song, artist, views, likes, year, commentsCount, comments, impressions);
        obj.getImpressions();
        obj.printRank();

    }
}