package com.noshadez.mintubeappdark;

/**
 * Created by shyam on 16/2/16.
 */
class Constants {

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
    //1 = 2160hd
    //2 = 1440hd
    //3 = 1080hd
    //4 = 720hd
    //5 = 480p
    //6 = 360p
    //7 = 240p
    //8 = 144p
    public  static  int playbackQuality = 5;
    //Finish service on end video
    public static boolean finishOnEnd = false;


    public static String getPlaybackQuality() {
        String strPlaybackQuality;
        if(playbackQuality == 0){
            strPlaybackQuality = "auto";
        }
        else if (playbackQuality == 1){
            strPlaybackQuality = "2160hd";
        }
        else if (playbackQuality == 2){
            strPlaybackQuality = "1440hd";
        }
        else if (playbackQuality == 3){
            strPlaybackQuality = "1080hd";
        }
        else if (playbackQuality == 4){
            strPlaybackQuality = "720hd";
        }
        else if (playbackQuality == 5){
            strPlaybackQuality = "480p";
        }
        else if (playbackQuality == 6){
            strPlaybackQuality = "360p";
        }
        else if (playbackQuality == 7){
            strPlaybackQuality = "240p";
        }
        else{
            strPlaybackQuality = "144p";
        }
        return strPlaybackQuality;
    }


    //Actions
    public interface ACTION {
        String PREV_ACTION = "com.noshadez.ytube.action.prev";
        String PAUSE_PLAY_ACTION = "com.noshadez.ytube.action.play";
        String NEXT_ACTION = "com.noshadez.ytube.action.next";
        String STARTFOREGROUND_WEB_ACTION = "com.noshadez.ytube.action.playingweb";
        String STOPFOREGROUND_WEB_ACTION = "com.noshadez.ytube.action.stopplayingweb";
        String STARTFOREGROUND_YTUBE_ACTION = "com.noshadez.ytube.action.playingytube";
        String STOPFOREGROUND_YTUBE_ACTION = "com.noshadez.ytube.action.stopplayingytube";
    }

    //Notification Id
    public interface NOTIFICATION_ID {
        int FOREGROUND_SERVICE = 101;
    }

}
