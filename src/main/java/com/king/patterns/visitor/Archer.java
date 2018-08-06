package com.king.patterns.visitor;

public class Archer implements Soldier {
    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    public String getArcher() {
        return "Archer";
    }
}