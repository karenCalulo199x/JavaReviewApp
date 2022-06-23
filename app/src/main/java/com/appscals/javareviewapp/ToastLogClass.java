package com.appscals.javareviewapp;

import android.content.Context;
import android.view.View;
import android.widget.Toast;

public class ToastLogClass {
    public static Integer add(Integer number1, Integer number2) {
        int sum = number1 + number2;
        System.out.println("The sum is " + sum);
        return sum;
    }

    public static void toast(Context ctx, String msg) {
        Toast.makeText(ctx , msg, Toast.LENGTH_SHORT).show();
    }
}
