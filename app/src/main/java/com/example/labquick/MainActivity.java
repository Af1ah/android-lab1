package com.example.labquick;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        EditText ed = findViewById(R.id.editTextText);
        TextView tv = findViewById(R.id.textView2);
        findViewById(R.id.button).setOnClickListener(v->{
            String s = ed.getText().toString();
            tv.setText(s);
            Toast.makeText(this, "hello", Toast.LENGTH_SHORT).show();
        });
        findViewById(R.id.button2).setOnClickListener(v->
        {
            Intent i = new Intent(this, Multiple.class);
            startActivity(i);
        });
        findViewById(R.id.button3).setOnClickListener(v -> {
            startActivity(new Intent(this, MainActivity3.class));
        });
        findViewById(R.id.button8).setOnClickListener(v -> {
            startActivity(new Intent(this, LoginPage.class));
        });
        findViewById(R.id.button9).setOnClickListener(v -> {
            startActivity(new Intent(this, RadioCheck.class));
        });
    }
}