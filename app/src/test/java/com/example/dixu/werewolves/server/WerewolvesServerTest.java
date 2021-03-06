package com.example.dixu.werewolves.server;

import com.example.dixu.werewolves.server.resources.Player;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * Test for {@link WerewolvesServer}.
 */
public class WerewolvesServerTest {
    private WerewolvesServer server = WerewolvesServer.getInstance();

    @Test
    public void getPlayer() {
        Player expected = Player.create(2);
        assertEquals(expected, server.getPlayer(2));
    }

    @Test
    public void getNumberOfPlayersAtBegin() {
        assertEquals(12, server.getNumPlayersAtBegin());
    }
}
