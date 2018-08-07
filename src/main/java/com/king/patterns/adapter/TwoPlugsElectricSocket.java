package com.king.patterns.adapter;

public class TwoPlugsElectricSocket implements ElectricSocket {
    @Override
    public void supplylEctricity() {
        System.out.println("使用[两片]插座供电");
    }
}
