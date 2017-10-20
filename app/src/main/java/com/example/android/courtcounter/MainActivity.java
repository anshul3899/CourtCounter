package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /**
     * Displays the given score for Team A.
     */
    int scoreTeamA=0;
    int scoreTeamB=0;
    public void displayForTeamA(int t) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(t));
    }
    public void displayForTeamB(int t) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(t));
    }


    public void point3teamA(View view){
        scoreTeamA=scoreTeamA+3;
        displayForTeamA(scoreTeamA);
    }
    public void point3teamB(View view){
        scoreTeamB=scoreTeamB+3;
        displayForTeamB(scoreTeamB);
    }

    public void point2teamA(View view){
        scoreTeamA=scoreTeamA+2;
        displayForTeamA(scoreTeamA);
    }

    public void point2teamB(View view){
        scoreTeamB=scoreTeamB+2;
        displayForTeamB(scoreTeamB);
    }
    public void freeTeamA(View view){
        scoreTeamA=scoreTeamA+1;
        displayForTeamA(scoreTeamA);
    }
    public void freeTeamB(View view){
        scoreTeamB=scoreTeamB+1;
        displayForTeamB(scoreTeamB);
    }
    public void reset(View view){
        scoreTeamA=0;
        scoreTeamB=0;
        displayForTeamA(0);
        displayForTeamB(0);
    }
}
