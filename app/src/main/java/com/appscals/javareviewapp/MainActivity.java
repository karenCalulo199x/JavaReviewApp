package com.appscals.javareviewapp;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button buttonOps,buttonBank;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonOps = findViewById(R.id.operators_btn);
        buttonBank = findViewById(R.id.bankAccount_btn);

        buttonOps.setOnClickListener(view -> {
            String message =
                    "The Sum is: " + ToastLogClass.add(1, 2) + "\n" +
                    "The Difference is: " + ToastLogClass.add(1, 2) + "\n" +
                    "The Product is: " + ToastLogClass.add(1, 2) + "\n" +
                    "The Quotient is: " + ToastLogClass.add(1, 2);
            ToastLogClass.toast(getApplication(), message);
        });

        buttonBank.setOnClickListener(view -> {
//            ToastLogClass.AlertUtils.showOKDialog(MainActivity.this, "title of dialog", "message to display in dialog");
            ToastLogClass.showCustomDialog(MainActivity.this, "Input Text 1:", "Input Text 2", false);
        });

    }

}