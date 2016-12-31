package com.example.dixu.werewolves;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

/**
 * App Main Activity before Start the game.
 */
public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onStartGame(View view) {
        Log.i(TAG, "Start Game is clicked!");
        Intent intent = new Intent(MainActivity.this, GameActivity.class);
        startActivity(intent);
    }
}
