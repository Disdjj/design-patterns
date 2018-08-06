package com.king.patterns.visitor;

public class Gunner implements Soldier {
    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    public String getGunner() {
        return "Gunner";
    }
}