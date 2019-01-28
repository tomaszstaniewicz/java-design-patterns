package com.jdp.brokerchain;

public class Creature {

    private Game game;

    private String name;
    private int baseAttack;
    private int baseDefence;

    public Creature(Game game, String name, int baseAttack, int baseDefence) {
        this.game = game;
        this.name = name;
        this.baseAttack = baseAttack;
        this.baseDefence = baseDefence;
    }

    public String getName() {
        return name;
    }

    public int getAttack() {
        Query attackQuery = new Query(name, Query.Attribute.ATTACK, this.baseAttack);
        game.queries.fire(attackQuery);
        return attackQuery.getResult();
    }

    public int getDefence() {
        Query defenceQuery = new Query(name, Query.Attribute.DEFENCE, this.baseDefence);
        game.queries.fire(defenceQuery);
        return defenceQuery.getResult();
    }


    @Override
    public String toString() {
        return "Creature{" +
                "name='" + name + '\'' +
                ", attack = " + getAttack() +
                ", defence = " + getDefence() +
                '}';
    }
}
