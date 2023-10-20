package com.example.calculator;

import android.widget.EditText;
import android.widget.TextView;

public class TextFields
{
    public EditText firstNumber;
    public EditText secondNumber;
    public TextView resultField;
    private final MainActivity _mainActivity;
    public TextFields(MainActivity mainActivity)
    {
        _mainActivity = mainActivity;
        CreateNumberFields();
    }
    private void CreateNumberFields()
    {
        firstNumber = _mainActivity.findViewById(R.id.firstNumber);
        secondNumber = _mainActivity.findViewById(R.id.secondNumber);
        resultField = _mainActivity.findViewById(R.id.resultField);
    }
}
