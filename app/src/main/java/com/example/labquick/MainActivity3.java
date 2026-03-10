package com.example.labquick;

import android.app.AlertDialog;
import android.graphics.Color;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AlertDialogLayout;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.dialog.MaterialAlertDialogBuilder;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main3);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        findViewById(R.id.button4).setOnClickListener(v->{
            findViewById(R.id.main).setBackgroundColor(Color.CYAN);
        });
        findViewById(R.id.button5).setOnClickListener(v->{
            findViewById(R.id.main).setBackground(getDrawable(R.drawable.ic_launcher_foreground));
        });
        findViewById(R.id.button6).setOnClickListener(v->{
           new AlertDialog.Builder(this)
                   .setTitle("hello")
                   .setMessage(new SimpleDateFormat("dd/MM/yy HH:mm:ss" ).format(new Date()))
                   .setPositiveButton("okey",null)
                   .setNegativeButton("no", null)

                   .show();

        });

    }
}