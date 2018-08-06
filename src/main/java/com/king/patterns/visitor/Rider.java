package com.king.patterns.visitor;

public class Rider implements Soldier {
    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    public String getRider() {
        return "Rider";
    }
}