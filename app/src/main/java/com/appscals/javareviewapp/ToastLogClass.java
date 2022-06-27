package com.appscals.javareviewapp;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class ToastLogClass {
    public static Integer add(Integer number1, Integer number2) {
        int sum = number1 + number2;
        System.out.println("The sum is " + sum);
        return sum;
    }

    public static void toast(Context ctx, String msg) {
        Toast.makeText(ctx , msg, Toast.LENGTH_SHORT).show();
    }

    public static class AlertUtils
    {
        public static void showOKDialog(Context context, String title, String message)
        {
            AlertDialog.Builder builder = new AlertDialog.Builder(context);
            builder.setTitle(title);
            builder.setMessage(message);
            builder.setPositiveButton(android.R.string.ok, null);
            builder.show();
        }
    }

    public static void showCustomDialog(Context context, String msg1, String msg2, Boolean isVisible){
        final Dialog dialog = new Dialog(context);
        //Disable the default title
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setCancelable(true);
        dialog.setContentView(R.layout.prompts);
        //Initialize
        final EditText editText1 = dialog.findViewById(R.id.editTextDialogUserInput1);
        final EditText editText2 = dialog.findViewById(R.id.editTextDialogUserInput2);
        final TextView textView1 = dialog.findViewById(R.id.textView1);
        final TextView textView2 = dialog.findViewById(R.id.textView2);
        final Button okButton = dialog.findViewById(R.id.ok_btn);

        textView1.setText(msg1);
        textView2.setText(msg2);

        if (!isVisible) {
            textView2.setVisibility(View.GONE);
            editText2.setVisibility(View.GONE);
        }

        okButton.setOnClickListener(view -> {
            String input1 = editText1.getText().toString();
            String input2 = editText2.getText().toString();

            Toast.makeText(context, "Input 1: " + input1, Toast.LENGTH_SHORT).show();
            Toast.makeText(context, "Input 2: " + input2, Toast.LENGTH_SHORT).show();

            dialog.dismiss();
        });

        dialog.show();

    }
}
