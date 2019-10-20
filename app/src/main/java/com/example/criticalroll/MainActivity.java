package com.example.criticalroll;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.Random;

import static android.view.View.*;

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
        imageViewDice.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                rollDice();

            }
        });

        FloatingActionButton floatingActionBtn = findViewById(R.id.floatingActionButton);
        floatingActionBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                startActivity(new Intent(MainActivity.this, ScoreList.class));
            }
        });

    }

    @SuppressLint("ResourceType")
    private void rollDice(){
        int randomNumber = rng.nextInt(20) + 1;

        SharedPreferences sharedPref = getSharedPreferences(getString(R.string.shared_prefs_key), Context.MODE_PRIVATE);
        int timesPressed = sharedPref.getInt(Integer.toString(randomNumber)+ "_score", 0);
        timesPressed++;

        SharedPreferences.Editor editor = sharedPref.edit();

        editor.putInt(Integer.toString(randomNumber)+ "_score", timesPressed);
        editor.commit();

        Log.d("myTag", "saved to Shared Prefs key: " + Integer.toString(randomNumber)+ "_score " + "and number of times should be: " + Integer.toString(timesPressed));

        switch (randomNumber){
            case 1:
                imageViewDice.setImageResource(R.drawable.dice1);
                hitTextView.setVisibility(INVISIBLE);
                missTextView.setVisibility(VISIBLE);
                final MediaPlayer wrongPlayer = MediaPlayer.create(this, R.raw.wrong);
                wrongPlayer.start();
;
                break;
            case 2:
                imageViewDice.setImageResource(R.drawable.dice2);
                hitTextView.setVisibility(INVISIBLE);
                missTextView.setVisibility(INVISIBLE);

                break;
            case 3:
                imageViewDice.setImageResource(R.drawable.dice3);
                hitTextView.setVisibility(INVISIBLE);
                missTextView.setVisibility(INVISIBLE);

                break;
            case 4:
                imageViewDice.setImageResource(R.drawable.dice4);
                hitTextView.setVisibility(INVISIBLE);
                missTextView.setVisibility(INVISIBLE);
                break;
            case 5:
                imageViewDice.setImageResource(R.drawable.dice5);
                hitTextView.setVisibility(INVISIBLE);
                missTextView.setVisibility(INVISIBLE);
                break;
            case 6:
                imageViewDice.setImageResource(R.drawable.dice6);
                hitTextView.setVisibility(INVISIBLE);
                missTextView.setVisibility(INVISIBLE);
                break;
            case 7:
                imageViewDice.setImageResource(R.drawable.dice7);
                hitTextView.setVisibility(INVISIBLE);
                missTextView.setVisibility(INVISIBLE);
                break;
            case 8:
                imageViewDice.setImageResource(R.drawable.dice8);
                hitTextView.setVisibility(INVISIBLE);
                missTextView.setVisibility(INVISIBLE);
                break;
            case 9:
                imageViewDice.setImageResource(R.drawable.dice9);
                hitTextView.setVisibility(INVISIBLE);
                missTextView.setVisibility(INVISIBLE);
                break;
            case 10:
                imageViewDice.setImageResource(R.drawable.dice10);
                hitTextView.setVisibility(INVISIBLE);
                missTextView.setVisibility(INVISIBLE);
                break;
            case 11:
                imageViewDice.setImageResource(R.drawable.dice11);
                hitTextView.setVisibility(INVISIBLE);
                missTextView.setVisibility(INVISIBLE);
                break;
            case 12:
                imageViewDice.setImageResource(R.drawable.dice12);
                hitTextView.setVisibility(INVISIBLE);
                missTextView.setVisibility(INVISIBLE);
                break;
            case 13:
                imageViewDice.setImageResource(R.drawable.dice13);
                hitTextView.setVisibility(INVISIBLE);
                missTextView.setVisibility(INVISIBLE);
                break;
            case 14:
                imageViewDice.setImageResource(R.drawable.dice14);
                hitTextView.setVisibility(INVISIBLE);
                missTextView.setVisibility(INVISIBLE);
                break;
            case 15:
                imageViewDice.setImageResource(R.drawable.dice15);
                hitTextView.setVisibility(INVISIBLE);
                missTextView.setVisibility(INVISIBLE);
                break;
            case 16:
                imageViewDice.setImageResource(R.drawable.dice16);
                hitTextView.setVisibility(INVISIBLE);
                missTextView.setVisibility(INVISIBLE);
                break;
            case 17:
                imageViewDice.setImageResource(R.drawable.dice17);
                hitTextView.setVisibility(INVISIBLE);
                missTextView.setVisibility(INVISIBLE);
                break;
            case 18:
                imageViewDice.setImageResource(R.drawable.dice18);
                hitTextView.setVisibility(INVISIBLE);
                missTextView.setVisibility(INVISIBLE);
                break;
            case 19:
                imageViewDice.setImageResource(R.drawable.dice19);
                hitTextView.setVisibility(INVISIBLE);
                missTextView.setVisibility(INVISIBLE);
                break;
            case 20:
                imageViewDice.setImageResource(R.drawable.dice20);
                hitTextView.setVisibility(VISIBLE);
                missTextView.setVisibility(INVISIBLE);
                final MediaPlayer correctPlayer = MediaPlayer.create(this, R.raw.correct);
                correctPlayer.start();
                break;
        }
    }
}
