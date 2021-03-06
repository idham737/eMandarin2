package com.idham.emandarin2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class ScenarioVideoTwo extends YouTubeBaseActivity implements YouTubePlayer.OnInitializedListener {

    public static final String API_KEY = "AIzaSyByr1yDs7ha1uu23zA_cDXwShw5Gjl3uxM";
    public static final String VIDEO_ID = "1vp4Zr9dxj0";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scenario_video_two);

        YouTubePlayerView youTubePlayerView = (YouTubePlayerView) findViewById(R.id.youtube_player2);
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

    private YouTubePlayer.PlayerStateChangeListener playerStateChangeListener = new YouTubePlayer.PlayerStateChangeListener(){
        @Override
        public void onAdStarted(){
        }

        @Override
        public void onError(YouTubePlayer.ErrorReason arg0){
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
