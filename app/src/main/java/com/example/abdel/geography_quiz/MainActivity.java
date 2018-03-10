package com.example.abdel.geography_quiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public Editable name = null;
    public Editable id = null;
    public EditText nameText = null;
    public EditText idText = null;
String nameIntent;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nameText = findViewById(R.id.editText);
        name = nameText.getText();
        idText = findViewById(R.id.editText2);
        id = idText.getText();

    }

    public void onClick(View view) {
        Intent QuizIntent = new Intent(MainActivity.this, QuizActivity.class);
        // Start the new activity
        if (nameText.length() >= 3 && idText.length() >= 3) {
            startActivity(QuizIntent);
        }

    }

}
