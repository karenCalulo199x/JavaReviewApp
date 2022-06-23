package com.appscals.javareviewapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonOps = (Button) findViewById(R.id.operators_btn);

        buttonOps.setOnClickListener(view -> {
            String message =
                    "The Sum is: " + ToastLogClass.add(1, 2) + "\n" +
                    "The Difference is: " + ToastLogClass.add(1, 2) + "\n" +
                    "The Product is: " + ToastLogClass.add(1, 2) + "\n" +
                    "The Quotient is: " + ToastLogClass.add(1, 2);
            ToastLogClass.toast(getApplication(), message);
//
        });

    }

}