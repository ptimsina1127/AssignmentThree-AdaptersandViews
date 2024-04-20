package com.example.assignmentthree_adaptersandviews;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.example.assignmentthree_adaptersandviews.data.User;

public class StartActivity extends AppCompatActivity {
    private Button signUpButton,loginButton,aboutButton,dashboardButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        initializeViews();

        signUpButton.setOnClickListener(view ->{
            //Transition from StartActivity --> To  SignupActivity
            Intent intent = new Intent(this,MainActivity.class);
            startActivity(intent);
            //finish(); // This closes the first activity. It is occasionally used.
        });
        loginButton.setOnClickListener(view ->{
            Intent intent = new Intent(this, LoginActivity.class);
            startActivity(intent);
        });
        aboutButton.setOnClickListener(view ->{

            User userPravat = new User("Pravat Kiran Timsina","Pravatktimsina@gmail.com");

            String activityTitle = "Welcome to About Activity";
            String activityAbout = "This is about Activity";
            Intent intent = new Intent(this, AboutActivity.class);
            intent.putExtra("activityTitle",activityTitle);
            intent.putExtra("activityAbout",activityAbout);
            intent.putExtra("code",200);
            intent.putExtra("user",userPravat);
            startActivity(intent);
        });
        dashboardButton.setOnClickListener(view ->{
            Intent intent = new Intent(this, DashboardActivity.class);
            startActivity(intent);
        });
    }

    private void initializeViews() {
        signUpButton = findViewById(R.id.signup_button);
        loginButton = findViewById(R.id.login_button);
        dashboardButton = findViewById(R.id.dashboard_button);
        aboutButton = findViewById(R.id.about_button);
    }
}