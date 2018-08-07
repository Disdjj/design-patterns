package com.king.patterns.adapter;

public class Computer {
    private Charger charger;

    public void setCharger(Charger charger) {
        this.charger = charger;
    }

    public void startingUp() {
        charger.charge();
    }
}