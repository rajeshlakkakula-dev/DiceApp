package com.rl.diceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button rollButton;
    ImageView leftView;
    ImageView rightView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rollButton = findViewById(R.id.btn_roll);
        leftView = findViewById(R.id.dice_one);
        rightView = findViewById(R.id.dice_two);

        final int diceArray[] = {
                R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6
        };


        rollButton.setOnClickListener(view -> {

            Random random = new Random();

            int number = random.nextInt(6);

            leftView.setImageResource(diceArray[number]);

            Random random1 = new Random();

            int num = random1.nextInt(6);

            rightView.setImageResource(diceArray[num]);


        });


    }
}