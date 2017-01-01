package com.example.dixu.werewolves.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.dixu.werewolves.R;
import com.example.dixu.werewolves.server.WerewolvesServer;

/**
 * List all players.
 */
public class ViewAllPlayersActivity extends AppCompatActivity {
    private static final String TAG = "ViewAllPlayersActivity";
    private ListView playersListView;
    private WerewolvesServer server = WerewolvesServer.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_all_players);
        Log.i(TAG, "ViewAllPlayersActivity is started!");

        playersListView = (ListView) findViewById(R.id.players_list_view);
        String[] listPlayers = new String[server.getNumPlayersAtBegin()];
        for (int i = 0; i < listPlayers.length; i++) {
            listPlayers[i] = Integer.toString(server.getPlayer(i).getId());
        }
        ArrayAdapter adapter =
                new ArrayAdapter(this, android.R.layout.simple_list_item_1, listPlayers);
        playersListView.setAdapter(adapter);
    }
}
