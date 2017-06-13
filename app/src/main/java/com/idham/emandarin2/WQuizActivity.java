package com.idham.emandarin2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class WQuizActivity extends AppCompatActivity {

    private int currentQuestion;
    private String [] questions;
    private String [] answers;
    private Button answerButton;
    private Button questionButton;
    private TextView questionView;
    private TextView answerView;
    private EditText answerText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wquiz);
        init();
    }

    public void init(){
        questions = new String[]{"What is the capital of Egypt?","What class are you in right now?"};
        answers = new String[]{"Cairo","IST380"};
        currentQuestion = -1;
        answerButton = (Button) findViewById(R.id.AnswerButton);
        questionButton = (Button) findViewById(R.id.QuestionButton);
        questionView = (TextView) findViewById(R.id.QuestionTextView);
        answerView = (TextView) findViewById(R.id.AnswerTextView);
        answerText = (EditText) findViewById(R.id.AnswerText);
        answerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkAnswer();
            }
        });
        questionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showQuestion();
            }
        });
    }

    public void showQuestion(){
        currentQuestion++;
        if(currentQuestion == questions.length)
            currentQuestion = 0;

        questionView.setText(questions[currentQuestion]);
        answerView.setText("");
        answerText.setText("");
    }

    public boolean isCorrect(String answer){
        return (answer.equalsIgnoreCase(answers[currentQuestion]));
    }

    public void checkAnswer(){
        String answer = answerText.getText().toString();

        if(isCorrect(answer))
            answerView.setText("You're right!");
        else
            answerView.setText("Sorry, the correct answer is "+answers[currentQuestion]);
    }
}
