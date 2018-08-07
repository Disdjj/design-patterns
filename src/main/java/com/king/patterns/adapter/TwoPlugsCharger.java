package com.king.patterns.adapter;

public class TwoPlugsCharger implements Charger {

    private ElectricSocket electricSocket;

    @Override
    public void setElectricSocket(ElectricSocket electricSocket) {
        this.electricSocket = electricSocket;
    }

    @Override
    public void charge() {
        System.out.println("使用[两片]插头充电器");
        electricSocket.supplylEctricity();
    }
}