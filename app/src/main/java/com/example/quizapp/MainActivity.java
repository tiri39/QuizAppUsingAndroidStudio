package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private QuestionLibrary QLib = new QuestionLibrary();
    private TextView sview, qview;
    private Button btnc1, btnc2, btnc3, btnc4, btnc5;
    private String ans;
    private int score = 0, qnum = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sview = (TextView) findViewById(R.id.tvscore);
        qview = (TextView) findViewById(R.id.tvQuestion);
        btnc1 = findViewById(R.id.btnChoice1);
        btnc2 = findViewById(R.id.btnChoice2);
        btnc3 = findViewById(R.id.btnChoice3);
        btnc4 = findViewById(R.id.btnChoice4);
        btnc5 = findViewById(R.id.btnChoice5);

        btnc1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    if(btnc1.getText() == ans)
                    {
                        score += 1;
                        updateScore(score);
                        updateQues();
                        Toast.makeText(MainActivity.this, "Correct", Toast.LENGTH_LONG).show();
                    }
                    else {
                        Toast.makeText(MainActivity.this, "Wrong", Toast.LENGTH_LONG).show();
                        updateQues();
                    }
                }
                catch(Exception e){
                    Toast.makeText(MainActivity.this, "Something is Wrong", Toast.LENGTH_LONG).show();
                }
            }
        });

        btnc2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    if(btnc2.getText() == ans)
                    {
                        score += 1;
                        updateScore(score);
                        updateQues();
                        Toast.makeText(MainActivity.this, "Correct", Toast.LENGTH_LONG).show();
                    }
                    else {
                        Toast.makeText(MainActivity.this, "Wrong", Toast.LENGTH_LONG).show();
                        updateQues();
                    }
                }
                catch(Exception e){
                    Toast.makeText(MainActivity.this, "Something is Wrong", Toast.LENGTH_LONG).show();
                }
            }
        });

        btnc3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    if(btnc3.getText() == ans)
                    {
                        score += 1;
                        updateScore(score);
                        updateQues();
                        Toast.makeText(MainActivity.this, "Correct", Toast.LENGTH_LONG).show();
                    }
                    else {
                        Toast.makeText(MainActivity.this, "Wrong", Toast.LENGTH_LONG).show();
                        updateQues();
                    }
                }
                catch(Exception e){
                    Toast.makeText(MainActivity.this, "Something is Wrong", Toast.LENGTH_LONG).show();
                }
            }
        });

        btnc4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    if(btnc4.getText() == ans)
                    {
                        score += 1;
                        updateScore(score);
                        updateQues();
                        Toast.makeText(MainActivity.this, "Correct", Toast.LENGTH_LONG).show();
                    }
                    else {
                        Toast.makeText(MainActivity.this, "Wrong", Toast.LENGTH_LONG).show();
                        updateQues();
                    }
                }
                catch(Exception e){
                    Toast.makeText(MainActivity.this, "Something is Wrong", Toast.LENGTH_LONG).show();
                }
            }
        });
        btnc5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateScore(score);
                Toast.makeText(MainActivity.this, "Quiz finished", Toast.LENGTH_LONG).show();
            }
        });

    }
    private void updateQues(){
        qview.setText(QLib.getQues(qnum));
        btnc1.setText(QLib.getChoice1(qnum));
        btnc2.setText(QLib.getChoice2(qnum));
        btnc3.setText(QLib.getChoice3(qnum));
        btnc4.setText(QLib.getChoice4(qnum));
        ans = QLib.getAns(qnum);
        qnum++;
    }
    private void updateScore(int point){
        sview.setText("Score: " + point);
    }
}