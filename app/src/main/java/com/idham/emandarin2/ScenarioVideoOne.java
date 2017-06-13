package com.idham.emandarin2;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;
import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;
import com.google.android.youtube.player.YouTubePlayer.PlayerStateChangeListener;
import com.google.android.youtube.player.YouTubePlayer.ErrorReason;

public class ScenarioVideoOne extends YouTubeBaseActivity implements YouTubePlayer.OnInitializedListener {

    public static final String API_KEY = "AIzaSyByr1yDs7ha1uu23zA_cDXwShw5Gjl3uxM";
    public static final String VIDEO_ID = "Dxunvlzoqx8";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scenario_video_one);

        YouTubePlayerView youTubePlayerView = (YouTubePlayerView) findViewById(R.id.youtube_player);
        youTubePlayerView.initialize(API_KEY,this);
    }

    @Override
    public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult result){
        Toast.makeText(this,"Failured to Initialize!",Toast.LENGTH_LONG).show();
    }
    @Override
    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer player, boolean wasRestored){
        player.setPlayerStateChangeListener(playerStateChangeListener);
        player.setPlaybackEventListener(playbackEventListener);

        if(!wasRestored){
            player.cueVideo(VIDEO_ID);
        }
    }

    private YouTubePlayer.PlaybackEventListener playbackEventListener = new YouTubePlayer.PlaybackEventListener(){
        @Override
        public void onBuffering(boolean arg0){
        }
        @Override
        public void onPaused(){
        }
        @Override
        public void onPlaying(){
        }
        @Override
        public void onSeekTo(int arg0){
        }
        @Override
        public void onStopped(){
        }
    };

    private PlayerStateChangeListener playerStateChangeListener = new PlayerStateChangeListener(){
        @Override
        public void onAdStarted(){
        }

        @Override
        public void onError(ErrorReason arg0){
        }

        @Override
        public void onLoaded(String arg0){
        }

        @Override
        public void onLoading(){
        }

        @Override
        public void onVideoEnded(){
        }

        @Override
        public void onVideoStarted(){
        }
    };
}
