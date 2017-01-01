package com.example.dixu.werewolves.server.resources;

import com.google.auto.value.AutoValue;

/**
 * A single player in the Werewolves game.
 */
@AutoValue
public abstract class Player {
    public static Player create(int id) {
        return new AutoValue_Player(id, Role.UNSPECIFIED, true);
    }

    public abstract int getId();
    public abstract Role getRole();
    public abstract boolean getIsAlive();
}
