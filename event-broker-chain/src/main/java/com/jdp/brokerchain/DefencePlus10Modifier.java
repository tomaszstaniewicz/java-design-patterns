package com.jdp.brokerchain;

public class DefencePlus10Modifier extends CreatureModifier {

    public DefencePlus10Modifier(Game game, Creature creature) {
        super(game, creature);

        this.token = this.game.queries.subscribe(query -> {
            if (query.getCreatureName().equals(this.creature.getName())
                    && Query.Attribute.DEFENCE.equals(query.getAttribute())) {

                query.setResult(query.getResult() + 10);
            }
        });
    }
}
