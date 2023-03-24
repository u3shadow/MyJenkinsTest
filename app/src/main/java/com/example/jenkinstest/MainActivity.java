package com.example.jenkinstest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startActivity(new Intent(this, MainActivity2.class));
       int i = 1;
        if(5 == i){
            System.out.println("Hello");
        }
    }
    protected int addFunction(int i,int j){
        return i+j;
    }
}