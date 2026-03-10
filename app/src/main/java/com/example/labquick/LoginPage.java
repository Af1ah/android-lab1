package com.example.labquick;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class LoginPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login_page);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        EditText uname = findViewById(R.id.Username);
        EditText pass = findViewById(R.id.editTextTextPassword);

        findViewById(R.id.LoginButton).setOnClickListener(v->{
            String usname = uname.getText().toString();
            String passs = pass.getText().toString();
            if (usname.equals("user")&&passs.equals("pass")){
                Toast.makeText(this, "login successful", Toast.LENGTH_SHORT).show();
            }else {
                Toast.makeText(this, "failed", Toast.LENGTH_SHORT).show();
            }
        });
    }
}