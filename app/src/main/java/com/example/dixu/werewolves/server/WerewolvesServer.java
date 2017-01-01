package com.example.dixu.werewolves.server;

import com.example.dixu.werewolves.server.resources.Player;

import java.util.ArrayList;
import java.util.List;

/**
 * Serve front-end activities.
 */

public class WerewolvesServer {
    private static final int NUM_PLAYERS_AT_BEGIN = 12;
    private static WerewolvesServer instance;
    private List<Player> players;

    private WerewolvesServer() {
        initPlayers();
    }

    private void initPlayers() {
        players = new ArrayList<>();
        for (int i = 0; i < NUM_PLAYERS_AT_BEGIN; i++) {
            players.add(Player.create(i));
        }
    }

    public static WerewolvesServer getInstance() {
        if (instance == null) {
            instance = new WerewolvesServer();
        }
        return instance;
    }

    public Player getPlayer(int id) {
        return players.get(id);
    }
    public int getNumPlayersAtBegin() {
        return NUM_PLAYERS_AT_BEGIN;
    }
}
