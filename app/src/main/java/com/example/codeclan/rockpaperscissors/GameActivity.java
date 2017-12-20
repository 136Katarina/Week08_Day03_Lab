package com.example.codeclan.rockpaperscissors;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class GameActivity extends AppCompatActivity {
    Button rockButton;
    Button paperButton;
    Button scissorsButton;
    int score;
    int computerScore;
    TextView showScore;
    TextView showComputerScore;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        score = 0;
        computerScore = 0;

        if (getIntent().getExtras() != null) {
            Intent intent = getIntent();
            Bundle extras = intent.getExtras();
            score = extras.getInt("score");
            computerScore = extras.getInt("computer_score");
        }

        rockButton = findViewById(R.id.button_rock);
        paperButton = findViewById(R.id.button_paper);
        scissorsButton = findViewById(R.id.button_scissors);
        showScore = findViewById(R.id.score_display);
        showComputerScore = findViewById(R.id.computer_score);

        showScore.setText("You've won: " + String.valueOf(score));
        showComputerScore.setText("Computer's won: " + String.valueOf(computerScore));
    }

    public void onRockButtonClicked(View button){
        String buttonText = rockButton.getText().toString();
        Game newGame = new Game(buttonText);
        String result = newGame.result();
        if (newGame.decideWin()) {
            score ++;
        } else if (!newGame.decideDraw()) {
            computerScore ++;
        }

        Intent intent = new Intent(this, ResultActivity.class);
        intent.putExtra("result", result);
        intent.putExtra("score", score);
        intent.putExtra("computer_score", computerScore);
        startActivity(intent);
    }

    public void onScissorsButtonClicked(View button){
        String buttonText = scissorsButton.getText().toString();
        Game newGame = new Game(buttonText);
        String result = newGame.result();
        if (newGame.decideWin()) {
            score ++;
        } else if (!newGame.decideDraw()) {
            computerScore ++;
        }

        Intent intent = new Intent(this, ResultActivity.class);
        intent.putExtra("result", result);
        intent.putExtra("score", score);
        intent.putExtra("computer_score", computerScore);
        startActivity(intent);
    }

    public void onPaperButtonClicked(View button){
        String buttonText = paperButton.getText().toString();
        Game newGame = new Game(buttonText);
        String result = newGame.result();
        if (newGame.decideWin()) {
            score ++;
        } else if (!newGame.decideDraw()) {
            computerScore ++;
        }

        Intent intent = new Intent(this, ResultActivity.class);
        intent.putExtra("result", result);
        intent.putExtra("score", score);
        intent.putExtra("computer_score", computerScore);
        startActivity(intent);
    }
}
