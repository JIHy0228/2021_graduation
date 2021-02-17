package org.techtown.graduation_project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // A 개발자가 B에게 푸시를 날린다.
        // B 개발자가 A에게 푸시를 날린다.
    }
}