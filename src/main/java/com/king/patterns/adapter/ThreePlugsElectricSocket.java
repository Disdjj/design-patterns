package com.king.patterns.adapter;

public class ThreePlugsElectricSocket implements ElectricSocket {
    @Override
    public void supplylEctricity() {
        System.out.println("使用[三片]插座供电");
    }
}