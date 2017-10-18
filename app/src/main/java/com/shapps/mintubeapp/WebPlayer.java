package com.shapps.mintubeapp;

import android.content.Context;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import java.util.Map;

import static android.webkit.WebView.*;

/**
 * Created by shyam on 15/3/16.
 */
class WebPlayer {

    private static WebView player;
    private Context context;

    public WebPlayer(Context context) {
        player = new WebView(context);
        this.context = context;
    }

    public void setupPlayer() {
        player.getSettings().setJavaScriptEnabled(true);


//         For debugging using chrome on PC
        setWebContentsDebuggingEnabled(false);

        player.setWebChromeClient(new WebChromeClient());
        player.getSettings().setMediaPlaybackRequiresUserGesture(false);

        player.getSettings().setUserAgentString("Mozilla/5.0 (Windows NT 6.2; Win64; x64; rv:21.0.0) Gecko/20121011 Firefox/21.0.0");

        //----------------------------To get Player Id-------------------------------------------

        player.addJavascriptInterface(new JavaScriptInterface((PlayerService) context), "Interface");
        player.setWebViewClient(new WebViewClient() {
                                    @Override
                                    public boolean shouldOverrideUrlLoading(WebView view, String url) {
                                        return true;
                                    }

                                    @Override
                                    public void onPageFinished(WebView view, String url) {
                                        PlayerService.addStateChangeListener();
                                    }
                                }
        );
    }

    public static void loadScript(String s) {
        player.loadUrl(s);
    }

    public static WebView getPlayer() {
        return player;
    }

    public void destroy() {
        player.destroy();
    }

    public void loadDataWithUrl(String videoHTML) {
        player.loadDataWithBaseURL("https://www.youtube.com/player_api", videoHTML, "text/html", null, null);
    }
}