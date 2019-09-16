package com.example.criticalroll;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.MediaRouteButton;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.PriorityQueue;
import java.util.Random;

import static com.example.criticalroll.R.id.critical_hit;
import static com.example.criticalroll.R.id.invisible;

public class MainActivity extends AppCompatActivity {
    private ImageView imageViewDice;
    private Random rng = new Random();
    private TextView hitTextView;
    private TextView missTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        hitTextView = findViewById(R.id.critical_hit);
        missTextView = findViewById(R.id.critical_miss);

        imageViewDice = findViewById(R.id.image_view_dice);
        imageViewDice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rollDice();

            }
        });


    }


    @SuppressLint("ResourceType")
    private void rollDice(){
        int randomNumber = rng.nextInt(20) + 1;

        switch (randomNumber){
            case 1:
                imageViewDice.setImageResource(R.drawable.dice1);
                hitTextView.setVisibility(View.INVISIBLE);
                missTextView.setVisibility(View.VISIBLE);
                final MediaPlayer wrongPlayer = MediaPlayer.create(this, R.raw.wrong);
                wrongPlayer.start();
                break;
            case 2:
                imageViewDice.setImageResource(R.drawable.dice2);
                hitTextView.setVisibility(View.INVISIBLE);
                missTextView.setVisibility(View.INVISIBLE);
                break;
            case 3:
                imageViewDice.setImageResource(R.drawable.dice3);
                hitTextView.setVisibility(View.INVISIBLE);
                missTextView.setVisibility(View.INVISIBLE);
                break;
            case 4:
                imageViewDice.setImageResource(R.drawable.dice4);
                hitTextView.setVisibility(View.INVISIBLE);
                missTextView.setVisibility(View.INVISIBLE);
                break;
            case 5:
                imageViewDice.setImageResource(R.drawable.dice5);
                hitTextView.setVisibility(View.INVISIBLE);
                missTextView.setVisibility(View.INVISIBLE);
                break;
            case 6:
                imageViewDice.setImageResource(R.drawable.dice6);
                hitTextView.setVisibility(View.INVISIBLE);
                missTextView.setVisibility(View.INVISIBLE);
                break;
            case 7:
                imageViewDice.setImageResource(R.drawable.dice7);
                hitTextView.setVisibility(View.INVISIBLE);
                missTextView.setVisibility(View.INVISIBLE);
                break;
            case 8:
                imageViewDice.setImageResource(R.drawable.dice8);
                hitTextView.setVisibility(View.INVISIBLE);
                missTextView.setVisibility(View.INVISIBLE);
                break;
            case 9:
                imageViewDice.setImageResource(R.drawable.dice9);
                hitTextView.setVisibility(View.INVISIBLE);
                missTextView.setVisibility(View.INVISIBLE);
                break;
            case 10:
                imageViewDice.setImageResource(R.drawable.dice10);
                hitTextView.setVisibility(View.INVISIBLE);
                missTextView.setVisibility(View.INVISIBLE);
                break;
            case 11:
                imageViewDice.setImageResource(R.drawable.dice11);
                hitTextView.setVisibility(View.INVISIBLE);
                missTextView.setVisibility(View.INVISIBLE);
                break;
            case 12:
                imageViewDice.setImageResource(R.drawable.dice12);
                hitTextView.setVisibility(View.INVISIBLE);
                missTextView.setVisibility(View.INVISIBLE);
                break;
            case 13:
                imageViewDice.setImageResource(R.drawable.dice13);
                hitTextView.setVisibility(View.INVISIBLE);
                missTextView.setVisibility(View.INVISIBLE);
                break;
            case 14:
                imageViewDice.setImageResource(R.drawable.dice14);
                hitTextView.setVisibility(View.INVISIBLE);
                missTextView.setVisibility(View.INVISIBLE);
                break;
            case 15:
                imageViewDice.setImageResource(R.drawable.dice15);
                hitTextView.setVisibility(View.INVISIBLE);
                missTextView.setVisibility(View.INVISIBLE);
                break;
            case 16:
                imageViewDice.setImageResource(R.drawable.dice16);
                hitTextView.setVisibility(View.INVISIBLE);
                missTextView.setVisibility(View.INVISIBLE);
                break;
            case 17:
                imageViewDice.setImageResource(R.drawable.dice17);
                hitTextView.setVisibility(View.INVISIBLE);
                missTextView.setVisibility(View.INVISIBLE);
                break;
            case 18:
                imageViewDice.setImageResource(R.drawable.dice18);
                hitTextView.setVisibility(View.INVISIBLE);
                missTextView.setVisibility(View.INVISIBLE);
                break;
            case 19:
                imageViewDice.setImageResource(R.drawable.dice19);
                hitTextView.setVisibility(View.INVISIBLE);
                missTextView.setVisibility(View.INVISIBLE);
                break;
            case 20:
                imageViewDice.setImageResource(R.drawable.dice20);
                hitTextView.setVisibility(View.VISIBLE);
                missTextView.setVisibility(View.INVISIBLE);
                final MediaPlayer correctPlayer = MediaPlayer.create(this, R.raw.correct);
                correctPlayer.start();
                break;

        }
    }
}
