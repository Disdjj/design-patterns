package com.king.patterns.adapter;

public class Main {
    /**
     * Hotel只有三片插座
     */
    private static final ElectricSocket ELECTRIC_SOCKET = new ThreePlugsElectricSocket();

    public static void main(String[] args) {
        // 这是我
        People me = new People();

        // 我提前带上了一个适配器
        ElectricSocketAdapter adapter = new TwoPlugsAdapterToThree();

        // 装备好适配器
        me.setAdapter(adapter);

        // 连接充电器等各种线
        me.connect(ELECTRIC_SOCKET);

        // 开始使用电脑
        me.useComputer();
    }
}