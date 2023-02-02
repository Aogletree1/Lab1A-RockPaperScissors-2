package com.example.cs408lab1a;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.ColorSpace;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.cs408lab1a.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    private ActivityMainBinding binding;
    private Model model;

    private int NUM_WEAPONS;
    private int playerChoice;
    private int computerChoice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        model = new Model();
        Log.d(TAG, "This is a DEBUG log message.");
        updateCounter();


    }

    public void onClick(View view) {
        Log.i(TAG, "Button clicked!");
        String tag = view.getTag().toString();
        int weaponNum = (int)(Math.random() * NUM_WEAPONS);

        Weapon w = Weapon.values()[weaponNum];
        if (weaponNum == 1) {
            computerChoice = 1;

        }



        if (tag.equals("rockB")) {
            playerChoice = 1;
            binding.pWeapon.setText(String.valueOf("Player's Weapon: Rock"));
        }
        else if (tag.equals("paperB")) {
            playerChoice = 2;
            binding.pWeapon.setText(String.valueOf("Player's Weapon: Paper"));
        }
        else if (tag.equals("scissorsB")) {
            playerChoice = 3;
            binding.pWeapon.setText(String.valueOf("Player's Weapon: Scissors"));
        }

        updateCounter();
    }

    private void updateCounter() {
        binding.score.setText(String.valueOf(model.getCounter()));
    }

}