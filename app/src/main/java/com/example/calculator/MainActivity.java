package com.example.calculator;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity
{
    private TextFields textFields;
    private Buttons buttons;

    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textFields = new TextFields(this);
        buttons = new Buttons(this, textFields);
    }
}