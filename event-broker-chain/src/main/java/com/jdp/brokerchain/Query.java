package com.jdp.brokerchain;

public class Query {

    enum Attribute {
        ATTACK,
        DEFENCE,
    }

    private String creatureName;
    private Attribute attribute;
    private int result = 0;

    public String getCreatureName() {
        return creatureName;
    }

    public Attribute getAttribute() {
        return attribute;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }


    public Query(String creatureName, Attribute attribute, int result) {
        this.creatureName = creatureName;
        this.attribute = attribute;
        this.result = result;
    }
}
