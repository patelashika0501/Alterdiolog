package com.example.alterdiolog;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Create an AlertDialog.Builder object
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Are you sure");
        builder.setMessage("Logout");

        // Set a positive button and its click listener
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                // Code to be executed when OK button is clicked
                // You can add your own custom logic here
                dialog.dismiss(); // Close the dialog
            }
        });

        // Set a negative button and its click listener
        builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                // Code to be executed when Cancel button is clicked
                // You can add your own custom logic here
                dialog.dismiss(); // Close the dialog
            }
        });

        // Create the AlertDialog
        AlertDialog dialog = builder.create();

        // Show the AlertDialog
        dialog.show();
    }
}
