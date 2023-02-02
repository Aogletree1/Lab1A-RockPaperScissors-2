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

    private int NUM_WEAPONS;
    private int playerChoice;
    int computerChoice;
    private int num;
    private int  pWin = 0;
    private int cWin = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        Log.d(TAG, "This is a DEBUG log message.");
        updateCounter();


    }

    public void onClick(View view) {
        Log.i(TAG, "Button clicked!");
        String tag = view.getTag().toString();

        NUM_WEAPONS = Weapon.values().length;

        int weaponNum = (int) (Math.random() * NUM_WEAPONS);
        Weapon w = Weapon.values()[weaponNum];
        computerChoice = w.ordinal();
        binding.score.setText(String.valueOf("Player: " + pWin + ", Computer: " + cWin));




        if (tag.equals("rockB")) {
            playerChoice = 1;
            binding.pWeapon.setText(String.valueOf("Player's Weapon: Rock"));
            for (int i = 0; i < playerChoice; ++i) {
                weaponNum = (int) (Math.random() * NUM_WEAPONS);
                w = Weapon.values()[weaponNum];
                computerChoice = w.ordinal();
            }
        }
        else if (tag.equals("paperB")) {
            playerChoice = 2;
            binding.pWeapon.setText(String.valueOf("Player's Weapon: Paper"));
            for (int i = 0; i < playerChoice; ++i) {
                weaponNum = (int) (Math.random() * NUM_WEAPONS);
                w = Weapon.values()[weaponNum];
                computerChoice = w.ordinal();
            }
        }
        else if (tag.equals("scissorsB")) {
            playerChoice = 3;
            binding.pWeapon.setText(String.valueOf("Player's Weapon: Scissors"));
            for (int i = 0; i < playerChoice; ++i) {
                weaponNum = (int) (Math.random() * NUM_WEAPONS);
                w = Weapon.values()[weaponNum];
                computerChoice = w.ordinal();

        }}
            if (computerChoice == 0) {
                binding.cWeapon.setText(String.valueOf("Computer's Weapon: " + w));


            }

            else if (computerChoice == 1) {
                binding.cWeapon.setText(String.valueOf("Computer's Weapon: " + w));

            }

            else if (computerChoice == 2) {
                binding.cWeapon.setText(String.valueOf("Computer's Weapon: " + w));

            }

        if (computerChoice == 0 && playerChoice == 1) {
                binding.winOutput.setText(String.valueOf("Draw!"));

            }

        else if (computerChoice == 1 && playerChoice == 2) {
            binding.winOutput.setText(String.valueOf("Draw!"));

        }

        else if (computerChoice == 2 && playerChoice == 3) {
            binding.winOutput.setText(String.valueOf("Draw!"));

        }

        else if (computerChoice == 0 && playerChoice == 2) {
            binding.winOutput.setText(String.valueOf("Player Wins!"));
                pWin++;
        }

        else if (computerChoice == 0 && playerChoice == 3) {
                binding.winOutput.setText(String.valueOf("Computer Wins!"));
                cWin++;
            }

        else if (computerChoice == 1 && playerChoice == 1) {
                binding.winOutput.setText(String.valueOf("Computer Wins!"));
            cWin++;
            }

        else if (computerChoice == 1 && playerChoice == 3) {
            binding.winOutput.setText(String.valueOf("Player Wins!"));
            pWin++;
        }

        else if (computerChoice == 2 && playerChoice == 1) {
            binding.winOutput.setText(String.valueOf("Player Wins!"));
            pWin++;
        }

        else if (computerChoice == 2 && playerChoice == 2) {
            binding.winOutput.setText(String.valueOf("Computer Wins!"));
            cWin++;
        }



        updateCounter();
    }

    private void updateCounter() {
        binding.score.setText(String.valueOf(("Player: " + pWin + ", Computer: " + cWin)));
    }

}