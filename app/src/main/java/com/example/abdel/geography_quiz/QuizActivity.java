package com.example.abdel.geography_quiz;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class QuizActivity extends AppCompatActivity {
    public int score;
    CheckBox firstAns, secondAns, thirdAns, fourthAns;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

    }

    //Calculating the first question Score

    public void first_Q_Calc(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        int count1 = 0;
        switch (view.getId()) {
            case R.id.q1_b:
                if (checked) {

                    if (count1 != 1) {                      //Prevent the user from taking the question score more than one time
                        score++;
                        count1 = 1;
                    }
                }
                break;
        }
    }

    //Calculating the second question Score

    public void second_Q_Calc(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        int count2 = 0;
        switch (view.getId()) {
            case R.id.q2_c:
                if (checked) {

                    if (count2 != 1) {                       //Prevent the user from taking the question score more than one time
                        score++;
                        count2 = 1;
                    }
                    break;
                }
        }
    }

    //Calculating the third question Score

    public void third_Q_Calc(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        int count3 = 0;
        switch (view.getId()) {
            case R.id.q3_c:
                if (checked) {

                    if (count3 != 1) {                         //Prevent the user from taking the question score more than one time
                        score++;
                        count3 = 1;
                    }
                    break;
                }
        }
    }

    //Calculating the fourth question Score

    public void fourth_Q_Calc(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        int count4 = 0;
        switch (view.getId()) {
            case R.id.q4_a:
                if (checked) {

                    if (count4 != 1) {                          //Prevent the user from taking the question score more than one time
                        score++;
                        count4 = 1;
                    }
                }
        }
    }

    //Calculating the fourth question Score

    public void fifth_Q_Calc(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        int count5 = 0;
        switch (view.getId()) {
            case R.id.q5_c:
                if (checked) {
                    if (count5 != 1) {                      //Prevent the user from taking the question score more than one time
                        score++;
                        count5 = 1;
                    }

                }
        }
    }

    //Calculating the sixth question Score

    public void sixth_Q_Calc(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        int count6 = 0;
        switch (view.getId()) {
            case R.id.q6_b:
                if (checked) {

                    if (count6 != 1) {                            //Prevent the user from taking the question score more than one time
                        score++;
                        count6 = 1;
                    }
                }
                break;

        }


    }

    //Calculating the seventh question Score

    public void seventh_Q_Calc(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        int count7 = 0;
        switch (view.getId()) {
            case R.id.q7_d:
                if (checked) {
                    if (count7 != 1) {                             //Prevent the user from taking the question score more than one time
                        score++;
                        count7 = 1;
                    }
                }
                break;
        }


    }

    //Calculating the eighth & ninth & tenth question score and print toast message

    public void calc_print(View view) {
/*
Calculating the eighth Question score
*/
        firstAns = (CheckBox) findViewById(R.id.q8_a);
        secondAns = (CheckBox) findViewById(R.id.q8_b);
        thirdAns = (CheckBox) findViewById(R.id.q8_c);
        fourthAns = (CheckBox) findViewById(R.id.q8_d);

        if (firstAns.isChecked() &&
                secondAns.isChecked() &&
                !thirdAns.isChecked() &&
                !fourthAns.isChecked()) {
            score++;
        }
        firstAns.toggle();
        secondAns.toggle();
        thirdAns.toggle();
        fourthAns.toggle();
/*
Calculating the ninth Question Score
*/
        EditText editText2 = (EditText) findViewById(R.id.editText4);
        String userString2 = editText2.getText().toString();
        String correctAnswer2 = "Nile";
        boolean isEditTextTrue2 = correctAnswer2.equals(userString2);
        if (isEditTextTrue2) {
            score++;
        } else {
            score = score;
        }
        userString2 = "";
        editText2.setText("");
/*
Calculating the tenth Question Score
*/

        EditText editText = (EditText) findViewById(R.id.editText3);
        String userString = editText.getText().toString();
        String correctAnswer = "India";
        boolean isEditTextTrue = correctAnswer.equals(userString);
        if (isEditTextTrue) {
            score++;
        } else {
            score = score;
        }
        userString = "";
        editText.setText("");

/*
Print Toast message
*/
        Context context = getApplicationContext();
        CharSequence text = "Congratulations You got " + score + "/10";
        int duration = Toast.LENGTH_LONG;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();




/*
Reset the score
*/
        score = 0;
    }

}