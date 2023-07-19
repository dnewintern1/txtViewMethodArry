package com.example.dualarrayndview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txtName = findViewById(R.id.txtName);
        TextView txtScoreOf = findViewById(R.id.txtScoreOf);
        TextView txtMaxValue = findViewById(R.id.txtMaxValue);
        TextView txtMinimumValue = findViewById(R.id.txtMinimumValue);
        TextView txtAverage = findViewById(R.id.txtAvgValue);

        int[][] myArray = { {43, 54, 65}, {43, 54, 65},{00, 54, 65},{43, 54, 65},{43, 54, 65},{43, 54, 99},{43, 54, 65},{43, 54, 65},{43, 54, 65}};

        Game Gameobj = new Game("The call of Duty", myArray);

              //  txtMaxValue.setText(Gameobj.getTheMaxValue() + " ");

               // txtMinimumValue.setText(Gameobj.getTheMinimumV() + " ");

                //txtAverage.setText(Gameobj.getAverageofScore(myArray));
      //  txtAverage.setText(String.valueOf(Gameobj.getAverageofScore(myArray)));
        txtName.setText(Gameobj.getGameName());
        Gameobj.lestoutputTheScorsToTheScreen(txtScoreOf);
        txtMaxValue.setText(Gameobj.getTheMaxValue() + " ");
        txtMinimumValue.setText((Gameobj.getTheMinimumV())+ " ");
        //txtAverage.setText(Gameobj.getTheAverageValueOsScore(myArray));


        String oldTxtGameAverageValueOfScores;
        for(int gameIndex = 0 ; gameIndex < myArray.length ; gameIndex++){
            oldTxtGameAverageValueOfScores = txtAverage.getText().toString() + gameIndex + "-";

            double averageValue = Gameobj.getTheAverageValueOsScore(myArray[gameIndex]);
            txtAverage.setText(oldTxtGameAverageValueOfScores + averageValue + "\n");
        }




    }
}