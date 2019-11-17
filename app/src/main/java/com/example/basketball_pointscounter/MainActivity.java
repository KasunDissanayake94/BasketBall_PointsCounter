package com.example.basketball_pointscounter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int teamA = 0;
    int teamB = 0;
    private ScoreViewModel mViewModel ;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mViewModel = ViewModelProviders.of(this).get(ScoreViewModel.class);
        displayForTeamA(mViewModel.scoreTeamA);
        displayForTeamB(mViewModel.scoreTeamB);
    }
// Team A points
    public void addConversionTeamA(View v) {
        mViewModel.scoreTeamA = mViewModel.scoreTeamA + 2;
        displayForTeamA(mViewModel.scoreTeamA);
    }

    public void addPenaltyTeamA(View v){
        mViewModel.scoreTeamA = mViewModel.scoreTeamA + 3;
        displayForTeamA(mViewModel.scoreTeamA);
    }

    public void addTryTeamA(View v){
        mViewModel.scoreTeamA = mViewModel.scoreTeamA + 5;
        displayForTeamA(mViewModel.scoreTeamA);
    }

//team B points
    public void addConversionTeamB(View v) {
        mViewModel.scoreTeamB = mViewModel.scoreTeamB + 2;
        displayForTeamA(mViewModel.scoreTeamB);
    }
    public void addPenaltyTeamB(View v){
        mViewModel.scoreTeamB = mViewModel.scoreTeamB + 3;
        displayForTeamA(mViewModel.scoreTeamB);
    }
    public void addTryTeamB(View v){
        mViewModel.scoreTeamB = mViewModel.scoreTeamB + 5;
        displayForTeamA(mViewModel.scoreTeamB);
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
