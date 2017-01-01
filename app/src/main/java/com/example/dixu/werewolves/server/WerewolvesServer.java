package com.example.dixu.werewolves.server;

import com.example.dixu.werewolves.server.entities.Player;

import java.util.ArrayList;
import java.util.List;

/**
 * Serve front-end activities.
 */

public class WerewolvesServer {
    private static final int NUM_PLAYERS_BEGIN = 12;
    List<Player> players;

    public WerewolvesServer() {
        initPlayers();
    }

    private void initPlayers() {
        players = new ArrayList<>();
        for (int i = 0; i < NUM_PLAYERS_BEGIN; i++) {
            players.add(new Player(i));
        }
    }

    public Player getPlayer(int id) {
        return players.get(id);
    }
}
