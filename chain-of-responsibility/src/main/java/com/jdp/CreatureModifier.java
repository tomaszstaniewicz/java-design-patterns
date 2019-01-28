package com.jdp;

public class CreatureModifier {

    protected Creature creature;
    protected CreatureModifier next;

    public CreatureModifier(Creature creature) {
        this.creature = creature;
    }

    public void add(CreatureModifier creatureModifier) {
        if (null == this.next) {
            this.next = creatureModifier;
        } else {
            this.next.add(creatureModifier);
        }
    }

    public void handle() {
        if(next != null) {
            next.handle();
        }
    }
}
