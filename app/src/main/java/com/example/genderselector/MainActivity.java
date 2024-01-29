package com.example.genderselector;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private CheckBox maleCheckBox, femaleCheckBox;
    private Button showResultButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        maleCheckBox = findViewById(R.id.maleCheckBox);
        femaleCheckBox = findViewById(R.id.femaleCheckBox);
        showResultButton = findViewById(R.id.showResultButton);

        showResultButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showSelectedGender();
            }
        });
    }

    private void showSelectedGender() {
        String resultMessage = "Был выбран ";

        if (maleCheckBox.isChecked() && femaleCheckBox.isChecked()) {
            resultMessage += "Мужской и Женский пол";
        } else if (maleCheckBox.isChecked()) {
            resultMessage += "Мужской пол";
        } else if (femaleCheckBox.isChecked()) {
            resultMessage += "Женский пол";
        } else {
            resultMessage += "никакой пол не был выбран";
        }

        showToast(resultMessage);
    }

    private void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}
