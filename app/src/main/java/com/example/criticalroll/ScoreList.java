package com.example.criticalroll;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.Preference;
import android.widget.ListView;
import android.widget.TextView;

public class ScoreList extends AppCompatActivity {

    private SharedPreferences sharedPref;
    private int actualTimesPressed;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score_list);

        TextView score1 = findViewById(R.id.score_1);
        TextView score2 = findViewById(R.id.score_2);
        TextView score3 = findViewById(R.id.score_3);
        TextView score4 = findViewById(R.id.score_4);
        TextView score5 = findViewById(R.id.score_5);
        TextView score6 = findViewById(R.id.score_6);
        TextView score7 = findViewById(R.id.score_7);
        TextView score8 = findViewById(R.id.score_8);
        TextView score9 = findViewById(R.id.score_9);
        TextView score10 = findViewById(R.id.score_10);
        TextView score11 = findViewById(R.id.score_11);
        TextView score12 = findViewById(R.id.score_12);
        TextView score13 = findViewById(R.id.score_13);
        TextView score14 = findViewById(R.id.score_14);
        TextView score15 = findViewById(R.id.score_15);
        TextView score16 = findViewById(R.id.score_16);
        TextView score17 = findViewById(R.id.score_17);
        TextView score18 = findViewById(R.id.score_18);
        TextView score19 = findViewById(R.id.score_19);
        TextView score20 = findViewById(R.id.score_20);

        SharedPreferences sharedPref = getSharedPreferences(getString(R.string.shared_prefs_key), Context.MODE_PRIVATE);

        int s1 = sharedPref.getInt("1_score", 0);
        int s2 = sharedPref.getInt("2_score", 0);
        int s3 = sharedPref.getInt("3_score", 0);
        int s4 = sharedPref.getInt("4_score", 0);
        int s5 = sharedPref.getInt("5_score", 0);
        int s6 = sharedPref.getInt("6_score", 0);
        int s7 = sharedPref.getInt("7_score", 0);
        int s8 = sharedPref.getInt("8_score", 0);
        int s9 = sharedPref.getInt("9_score", 0);
        int s10 = sharedPref.getInt("10_score", 0);
        int s11 = sharedPref.getInt("11_score", 0);
        int s12 = sharedPref.getInt("12_score", 0);
        int s13 = sharedPref.getInt("13_score", 0);
        int s14 = sharedPref.getInt("14_score", 0);
        int s15 = sharedPref.getInt("15_score", 0);
        int s16 = sharedPref.getInt("16_score", 0);
        int s17 = sharedPref.getInt("17_score", 0);
        int s18 = sharedPref.getInt("18_score", 0);
        int s19 = sharedPref.getInt("19_score", 0);
        int s20 = sharedPref.getInt("20_score", 0);



        score1.setText("D1 rolled " + Integer.toString(s1) + " times");
        score2.setText("D2 rolled " + Integer.toString(s2) + " times");
        score3.setText("D3 rolled " + Integer.toString(s3) + " times");
        score4.setText("D4 rolled " + Integer.toString(s4) + " times");
        score5.setText("D5 rolled " + Integer.toString(s5) + " times");
        score6.setText("D6 rolled " + Integer.toString(s6) + " times");
        score7.setText("D7 rolled " + Integer.toString(s7) + " times");
        score8.setText("D8 rolled " + Integer.toString(s8) + " times");
        score9.setText("D9 rolled " + Integer.toString(s9) + " times");
        score10.setText("D10 rolled " + Integer.toString(s10) + " times");
        score11.setText("D11 rolled " + Integer.toString(s11) + " times");
        score12.setText("D12 rolled " + Integer.toString(s12) + " times");
        score13.setText("D13 rolled " + Integer.toString(s13) + " times");
        score14.setText("D14 rolled " + Integer.toString(s14) + " times");
        score15.setText("D15 rolled " + Integer.toString(s15) + " times");
        score16.setText("D16 rolled " + Integer.toString(s16) + " times");
        score17.setText("D17 rolled " + Integer.toString(s17) + " times");
        score18.setText("D18 rolled " + Integer.toString(s18) + " times");
        score19.setText("D19 rolled " + Integer.toString(s19) + " times");
        score20.setText("D20 rolled " + Integer.toString(s20) + " times");



    }
}
