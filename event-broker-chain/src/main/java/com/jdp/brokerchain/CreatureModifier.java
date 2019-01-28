package com.jdp.brokerchain;

public class CreatureModifier implements AutoCloseable {

    protected Game game;
    protected Creature creature;
    protected int token;

    public CreatureModifier(Game game, Creature creature) {
        this.game = game;
        this.creature = creature;
    }

    @Override
    public void close() {
        this.game.queries.unsubscribe(token);
    }
}
