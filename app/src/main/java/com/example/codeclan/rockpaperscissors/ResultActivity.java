package com.example.codeclan.rockpaperscissors;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    TextView resultText;
    int score;
    int computerScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        resultText = (TextView)findViewById(R.id.result_view);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        String result = extras.getString("result");
        score = extras.getInt("score");
        computerScore = extras.getInt("computer_score");
        resultText.setText(result);
    }

    public void onPlayAgainButtonCLicked(View button) {
        Intent intent = new Intent(this, GameActivity.class);
        intent.putExtra("score", score);
        intent.putExtra("computer_score", computerScore);
        startActivity(intent);
    }
}
