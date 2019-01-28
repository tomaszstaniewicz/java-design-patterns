package com.jdp;

public class IncreaseDefenceModifier extends CreatureModifier {

    public IncreaseDefenceModifier(Creature creature) {
        super(creature);
    }

    @Override
    public void handle() {
        System.out.println("Increasing " + creature.getName() + " defence.");
        creature.setDefence(creature.getDefence() + 3);
        super.handle();
    }
}
