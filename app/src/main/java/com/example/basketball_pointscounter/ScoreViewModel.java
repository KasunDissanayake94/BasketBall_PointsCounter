package com.example.basketball_pointscounter;

import androidx.lifecycle.ViewModel;

public class ScoreViewModel extends ViewModel {

    // Tracks the score for Team A
    public int scoreTeamA = 0;

    // Tracks the score for Team B
    public int scoreTeamB = 0;

    public ScoreViewModel(){

    }

    public ScoreViewModel(int scoreTeamA, int scoreTeamB) {
        this.scoreTeamA = scoreTeamA;
        this.scoreTeamB = scoreTeamB;
    }

    public void setScoreTeamA(int scoreTeamA) {
        this.scoreTeamA = scoreTeamA;
    }

    public void setScoreTeamB(int scoreTeamB) {
        this.scoreTeamB = scoreTeamB;
    }

    public int getScoreTeamA() {
        return scoreTeamA;
    }

    public int getScoreTeamB() {
        return scoreTeamB;
    }
}
