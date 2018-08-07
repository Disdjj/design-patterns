package com.king.patterns.adapter;

public interface ElectricSocketAdapter extends ElectricSocket {
    @Override
    void supplylEctricity();

    void setElectricSocket(ElectricSocket electricSocket);
}