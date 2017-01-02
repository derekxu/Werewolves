package com.example.dixu.werewolves.activities;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.dixu.werewolves.R;
import com.example.dixu.werewolves.server.resources.Player;

import java.util.List;

/**
 * Adapt a list of {@link Player} to a List View.
 */

public class PlayerAdapter extends BaseAdapter {
    private static final String TAG = "PlayerAdapter";

    private Context context;
    private LayoutInflater inflater;
    private List<Player> players;

    public PlayerAdapter(Context context, List<Player> players) {
        this.context = context;
        this.players = players;
        inflater = (LayoutInflater) this.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    @Override
    public int getCount() {
        return players.size();
    }

    @Override
    public Object getItem(int i) {
        return players.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View rowView = inflater.inflate(R.layout.list_players, viewGroup, false);
        TextView idTextView = (TextView) rowView.findViewById(R.id.player_list_id);
        idTextView.setText("Player " + Integer.toString(players.get(i).getNumber()));

        TextView roleTextView = (TextView) rowView.findViewById(R.id.player_list_role);
        roleTextView.setText(players.get(i).getRole().toString());

        TextView aLiveTextView = (TextView) rowView.findViewById(R.id.player_list_alive);
        if (players.get(i).getIsAlive()) {
            aLiveTextView.setText("Alive");
        } else {
            aLiveTextView.setText("Dead");
        }

        return rowView;
    }
}
