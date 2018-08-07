package com.king.patterns.adapter;

public class TwoPlugsAdapterToThree implements ElectricSocketAdapter {
    private ElectricSocket electricSocket;

    @Override
    public void setElectricSocket(ElectricSocket electricSocket) {
        this.electricSocket = electricSocket;
    }

    @Override
    public void supplylEctricity() {
        System.out.println("适配器负责将[两片]转为[三片]");
        electricSocket.supplylEctricity();
    }
}