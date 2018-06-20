package com.pakhigupta.higherorlower;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends Activity {

    Random random = new Random();
    int number = 1 + random.nextInt(49);

    public void restart(View view) {

        number =  1+ random.nextInt(49);

        Toast.makeText(MainActivity.this, "Restarted!" , Toast.LENGTH_SHORT).show();
    }

    public void guess(View view) {

        EditText numberText = (EditText) findViewById(R.id.num);
        int num = Integer.parseInt(numberText.getText().toString());
        String message = "";
        if (num==number) {
            message = "You guessed it!";
        }
        else if (num < number) {
            message = "Go Higher!";
        }
        else {
            message = "Go Lower!";
        }

        Toast.makeText(MainActivity.this, message, Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
