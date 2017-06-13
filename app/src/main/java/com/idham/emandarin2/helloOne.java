package com.idham.emandarin2;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class helloOne extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello_one);

        final MediaPlayer helloOne = MediaPlayer.create(this,R.raw.hello1);
        ImageButton hello1Btn = (ImageButton) this.findViewById(R.id.helloOne);
        hello1Btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){ helloOne.start();
            }
        });
    }
}
