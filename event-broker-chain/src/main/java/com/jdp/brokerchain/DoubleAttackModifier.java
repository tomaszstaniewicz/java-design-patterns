package com.jdp.brokerchain;

public class DoubleAttackModifier extends CreatureModifier {

    public DoubleAttackModifier(Game game, Creature creature) {
        super(game, creature);

        this.token = this.game.queries.subscribe(query -> {
            if (query.getCreatureName().equals(this.creature.getName())
                    && Query.Attribute.ATTACK.equals(query.getAttribute())) {

                query.setResult(query.getResult() * 2);
            }
        });
    }
}
