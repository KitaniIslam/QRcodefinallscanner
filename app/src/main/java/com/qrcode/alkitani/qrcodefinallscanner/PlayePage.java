package com.qrcode.alkitani.qrcodefinallscanner;

import android.media.MediaPlayer;
//import android.os.Handler;
//import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
//import android.widget.Button;
import android.widget.ImageView;
//import android.widget.SeekBar;
//import android.widget.TextView;

import static android.R.drawable.ic_media_pause;
import static android.R.drawable.ic_media_play;
//import static android.R.drawable.stat_notify_chat;

public class PlayePage extends AppCompatActivity {

    ImageView playBtn;
    MediaPlayer mp;
   // int duration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        playBtn = (ImageView) findViewById(R.id.playBtn);


        // Media Player
        mp = MediaPlayer.create(this, R.raw.freeklane);
        mp.setLooping(true);
        mp.seekTo(0);
        mp.setVolume(0.5f, 0.5f);
      //duration = mp.getDuration();

    }
        public void playBtnClick (View view) {

            if (!mp.isPlaying()) {
                // Stopping
                mp.start();
                playBtn.setBackgroundResource(R.drawable.pauseb);

            } else {
                // Playing
                mp.pause();
                playBtn.setBackgroundResource(R.drawable.playb);
            }

        }

}