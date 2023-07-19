package com.example.dualarrayndview;

import android.widget.TextView;

public class Game {

    String GameName;
    int[][] Score;

    public Game(String GameName, int[][] Score) {
        this.GameName = GameName;
        this.Score = Score;
    }

    public String getGameName() {
        return GameName;
    }

    public void setGameName(String gameName) {
        GameName = gameName;
    }

    public int getTheMinimumV() {
        int LowestValue = Score[0][0];

        for (int[] Newscore : Score) {
            for (int lowV : Newscore) {
                if (LowestValue > lowV) {
                    LowestValue = lowV;
                }

            }


        }
        return LowestValue;
    }

        public int getTheMaxValue(){

            int HighestValue = Score[0][0];

            for (int[] Maxsocre : Score) {

                for (int insideSC : Maxsocre) {

                    if (insideSC > HighestValue) {
                        HighestValue = insideSC;
                    }
                }

            }
            return HighestValue;
        }
        public double getTheAverageValueOsScore(int[] Score){
        int total =0;
        for(int scores:Score){
            total+=scores;
        }
        return(double)total/Score.length;
        }

        public void lestoutputTheScorsToTheScreen(TextView textView){
        String oldTextViewValue;
        for(int gameIndex =0; gameIndex<Score.length;gameIndex++){
            for(int gameScore=0 ; gameScore<gameIndex; gameScore++) {
                oldTextViewValue = textView.getText().toString();

                textView.setText(String.format(oldTextViewValue + "game Number %2d  : %3d\n\n\n", (gameIndex + 1), gameScore));
            }
        }
        }

}