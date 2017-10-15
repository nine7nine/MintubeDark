package com.shapps.mintubeapp;

/**
 * Created by shyam on 16/2/16.
 */
public class Constants {

    //Type of player
    //WebView player = 0
    //Youtube player = 1
    public  static  int playerType = 0;

    //Type of link
    //Single song link = 0
    //Playlist link = 1
    public  static  int linkType = 0;

    //Repeat
    //if repeatType = 0  --> no repeatType
    //if repeatType = 1  --> repeatType complete
    //if repeatType = 2  --> repeatType single
    public  static  int repeatType = 0;
    public  static  int noOfRepeats = 0;
    //Playback Quality
    //0 = auto
    //1 = hd2160
    //2 = hd1440
    //3 = hd1080
    //4 = hd720
    //5 = large(480p)
    //6 = medium(360p)
    //7 = small(240p)
    //8 = tiny(144p)
    public  static  int playbackQuality = 5;
    //Finish service on end video
    public static boolean finishOnEnd = false;


    private static String strPlaybackQuality = "large";
    public static String getPlaybackQuality() {
        if(playbackQuality == 0){
            strPlaybackQuality = "auto";
        }
        else if (playbackQuality == 1){
            strPlaybackQuality = "hd2160";
        }
        else if (playbackQuality == 2){
            strPlaybackQuality = "hd1440";
        }
        else if (playbackQuality == 3){
            strPlaybackQuality = "hd1080";
        }
        else if (playbackQuality == 4){
            strPlaybackQuality = "hd720";
        }
        else if (playbackQuality == 5){
            strPlaybackQuality = "large";
        }
        else if (playbackQuality == 6){
            strPlaybackQuality = "medium";
        }
        else if (playbackQuality == 7){
            strPlaybackQuality = "small";
        }
        else{
            strPlaybackQuality = "tiny";
        }
        return strPlaybackQuality;
    }


    //Actions
    public interface ACTION {
        String PREV_ACTION = "com.shapps.ytube.action.prev";
        String PAUSE_PLAY_ACTION = "com.shapps.ytube.action.play";
        String NEXT_ACTION = "com.shapps.ytube.action.next";
        String STARTFOREGROUND_WEB_ACTION = "com.shapps.ytube.action.playingweb";
        String STOPFOREGROUND_WEB_ACTION = "com.shapps.ytube.action.stopplayingweb";
        String STARTFOREGROUND_YTUBE_ACTION = "com.shapps.ytube.action.playingytube";
        String STOPFOREGROUND_YTUBE_ACTION = "com.shapps.ytube.action.stopplayingytube";
    }

    //Notification Id
    public interface NOTIFICATION_ID {
        public static int FOREGROUND_SERVICE = 101;
    }

}
