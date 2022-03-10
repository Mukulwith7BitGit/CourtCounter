package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(scoreTeamA);
    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void addThreeForTeamA(View v){
        scoreTeamA+=3;
        displayForTeamA(scoreTeamA);
    }
    public void addTwoForTeamA(View v){
        scoreTeamA+=2;
        displayForTeamA(scoreTeamA);
    }
    public void addOneForTeamA(View v){
        scoreTeamA+=1;
        displayForTeamA(scoreTeamA);
    }
}