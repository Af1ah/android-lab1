package com.example.labquick;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class RadioCheck extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_radio_check);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        RadioGroup rg = findViewById(R.id.radioGroup);
        CheckBox ch1 = findViewById(R.id.checkBox);
        CheckBox ch2 = findViewById(R.id.checkBox2);
        findViewById(R.id.gender).setOnClickListener(
                v->{
                    int id = rg.getCheckedRadioButtonId();
                    if (id == -1){
                        Toast.makeText(this, "please select anything", Toast.LENGTH_SHORT).show();
                    } else if (id == R.id.radioButton) {
                        Toast.makeText(this, "male", Toast.LENGTH_SHORT).show();
                    }else if (id == R.id.radioButton2) {
                        Toast.makeText(this, "female", Toast.LENGTH_SHORT).show();
                    }
                }
        );
        findViewById(R.id.check).setOnClickListener(
             v -> {
                 String msg = "";

                 if (ch1.isChecked()) {
                     msg += "Option 1 ";
                 }

                 if (ch2.isChecked()) {
                     msg += "Option 2 ";
                 }

                 Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
             }
        );
    }
}