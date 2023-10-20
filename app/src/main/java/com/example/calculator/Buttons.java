package com.example.calculator;

import static java.lang.Double.parseDouble;
import android.view.View;
import android.widget.Button;

public class Buttons implements View.OnClickListener
{
    public Button addButton;
    public Button subButton;
    public Button mulButton;
    public Button divButton;
    private double firstNumber;
    private double secondNumber;
    private double result;
    private final MainActivity _mainActivity;
    private final TextFields _textFields;
    public Buttons(MainActivity mainActivity, TextFields textFields)
    {
        _mainActivity = mainActivity;
        _textFields = textFields;
        CreateButtons();
        SetButtonsNames();
        AddButtonsEventListeners();
    }
    private void CreateButtons()
    {
        addButton = _mainActivity.findViewById(R.id.addButton);
        subButton = _mainActivity.findViewById(R.id.subButton);
        mulButton = _mainActivity.findViewById(R.id.mulButton);
        divButton = _mainActivity.findViewById(R.id.divButton);
    }
    private void SetButtonsNames()
    {
        addButton.setText("+");
        subButton.setText("-");
        mulButton.setText("*");
        divButton.setText("/");
    }
    private void AddButtonsEventListeners()
    {
        addButton.setOnClickListener(this);
        subButton.setOnClickListener(this);
        mulButton.setOnClickListener(this);
        divButton.setOnClickListener(this);
    }
    private void HandleButtonClick(View v)
    {
        if (v.getId() == R.id.addButton)
        {
            AddButtonClicked();
        }
        else if (v.getId() == R.id.subButton)
        {
            SubButtonClicked();
        }
        else if (v.getId() == R.id.mulButton)
        {
            MulButtonClicked();
        }
        else if (v.getId() == R.id.divButton)
        {
            DivButtonClicked();
        }
    }
    private void DivButtonClicked()
    {
        result = firstNumber / secondNumber;
    }

    private void MulButtonClicked()
    {
        result = firstNumber * secondNumber;
    }

    private void SubButtonClicked()
    {
        result = firstNumber - secondNumber;
    }

    private void AddButtonClicked()
    {
        result = firstNumber + secondNumber;
    }

    @Override
    public void onClick(View v)
    {
        GetDataFromTextFields();
        HandleButtonClick(v);
        DisplayData();
    }

    private void DisplayData()
    {
        _textFields.resultField.setText(Double.toString(result));
    }

    private void GetDataFromTextFields()
    {
        try
        {
            firstNumber = parseDouble(String.valueOf(_textFields.firstNumber.getText()));
            secondNumber = parseDouble(String.valueOf(_textFields.secondNumber.getText()));
        }
        catch (Exception e)
        {
            _textFields.firstNumber.setText("");
            _textFields.secondNumber.setText("");
        }
    }
}
