package com.jdp;

/*
*   This demo shows how to chain modifiers (CreatureModifiers) to modify Creature object.
*
*/
public class Demo {

    public static void main(String[] args) {

        Creature goblin = new Creature("Goblin", 10, 15);

        CreatureModifier root = new DoubleAttackModifier(goblin);
        CreatureModifier attackModifier2 = new DoubleAttackModifier(goblin);
        CreatureModifier defenceModifier = new IncreaseDefenceModifier(goblin);

        root.add(defenceModifier);
        root.add(attackModifier2);

        root.handle();

        System.out.println(goblin);
    }
}
