package com.example.basketball_pointscounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int teamA = 0;
    int teamB = 0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
// Team A points
    public void addConversionTeamA(View v) {
        teamA = teamA + 2;
        displayForTeamA(teamA);
    }

    public void addPenaltyTeamA(View v){
        teamA = teamA + 3;
        displayForTeamA(teamA);
    }

    public void addTryTeamA(View v){
        teamA = teamA + 5;
        displayForTeamA(teamA);
    }

//team B points
    public void addConversionTeamB(View v) {
        teamB = teamB + 2;
        displayForTeamB(teamB);
    }
    public void addPenaltyTeamB(View v){
        teamB = teamB + 3;
        displayForTeamB(teamB);
    }
    public void addTryTeamB(View v){
        teamB = teamB + 5;
        displayForTeamB(teamB);
    }



    //display points in team A
    private void displayForTeamA(int teamA) {
        TextView scoreA = (TextView)findViewById(R.id.team_a_score);
        scoreA.setText(String.valueOf(teamA));

    }
    //display points in team B
    private void displayForTeamB(int teamB) {
        TextView scoreB = (TextView)findViewById(R.id.team_b_score);
        scoreB.setText(String.valueOf(teamB));

    }



    public void resetScore(View v) {
        teamA = 0;
        teamB = 0;
        displayForTeamA(teamA);
        displayForTeamB(teamB);
    }

}
