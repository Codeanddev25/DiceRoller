package com.jindal.diceroller;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private ImageView imageViewDice;
    private Random rNum = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageViewDice = findViewById(R.id.image_view_dice);
        imageViewDice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rollDice();
            }
        });
    }

    private void rollDice() {
        int randomNumber = rNum.nextInt(6) + 1;
        switch (randomNumber) {
            case 1:
                imageViewDice.setImageResource(R.drawable.d1);
                break;
            case 2:
                imageViewDice.setImageResource(R.drawable.d2);
                break;
            case 3:
                imageViewDice.setImageResource(R.drawable.d3);
                break;
            case 4:
                imageViewDice.setImageResource(R.drawable.d4);
                break;
            case 5:
                imageViewDice.setImageResource(R.drawable.d5);
                break;
            case 6:
                imageViewDice.setImageResource(R.drawable.d6);
                break;
        }
    }
}