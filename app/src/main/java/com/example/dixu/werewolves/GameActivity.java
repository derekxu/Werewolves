package com.example.dixu.werewolves;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class GameActivity extends AppCompatActivity {
    private static final String TAG = "GameActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
    }

    public void onStartGame(View view) {
        Log.i(TAG, "NEXT is clicked!");
    }
}
