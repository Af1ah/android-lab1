package com.example.labquick;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Multiple extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiple);
        EditText ed = findViewById(R.id.editTextText2);
        TextView tv = findViewById(R.id.multiplecation);
        findViewById(R.id.button10).setOnClickListener(
                v->{
                    int n = Integer.parseInt(ed.getText().toString());
                    String result = "";
                    for (int i = 0;i<10;i++){
                        result +=(String.format("%dx%d=%d \n", i, n, i * n));
                    }
                    tv.setText(result);
                }
        );
    }
}