package com.example.dixu.werewolves.server.entities;

/**
 * A single player in the Werewolves game.
 */

public class Player {
    private int id;
    private String name;
    private Role role;
    private boolean isAlive;

    public Player(int id) {
        this(id, null, Role.UNSPECIFIED, true);
    }

    Player(int id, String name, Role role, boolean isAlive) {
        // displayId is id+1
        this.id = id;
        this.name = name;
        this.role = role;
        this.isAlive = isAlive;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Role getRole() {
        return role;
    }

    public int getId() {
        return id;
    }

    public int getDisplayId() {
        return getId() + 1;
    }

    public void setDead() {
        isAlive = false;
    }

    public boolean getIsAlive() {
        return isAlive;
    }
}
