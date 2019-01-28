package com.jdp.brokerchain;

public class Demo {

    public static void main(String[] args) {
        Game game = new Game();

        Creature goblin = new Creature(game, "Goblin", 10, 10);

        CreatureModifier defencePlus10Modifier1 = new DefencePlus10Modifier(game, goblin);
        CreatureModifier defencePlus10Modifier2 = new DefencePlus10Modifier(game, goblin);
        CreatureModifier doubleAttackModifier = new DoubleAttackModifier(game, goblin);

        System.out.println(goblin);
        defencePlus10Modifier1.close();
        doubleAttackModifier.close();
        System.out.println(goblin);

    }
}
