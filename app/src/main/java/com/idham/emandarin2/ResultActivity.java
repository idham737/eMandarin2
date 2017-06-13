package com.idham.emandarin2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ResultActivity extends AppCompatActivity {

    private Button mButtonTryAgain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        TextView textScore = (TextView) findViewById(R.id.textScore);
        Button mButtonTryAgain = (Button) findViewById(R.id.TryAgain);

        Intent intent = getIntent();
        int score = intent.getIntExtra("score",0);
        textScore.setText("Your score:" +score+ "/10");

        mButtonTryAgain.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(ResultActivity.this, QuizActivity.class);
                startActivity(intent);
            }
        });
    }
}
