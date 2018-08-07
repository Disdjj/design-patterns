package com.king.patterns.adapter;

public class People {
    private Computer computer;
    private Charger charger;
    private ElectricSocketAdapter adapter;

    public People() {
        this.computer = new Computer();
        this.charger = new TwoPlugsCharger();
    }

    /**
     * 如果需要适配器, 那就在这里设置
     */
    public void setAdapter(ElectricSocketAdapter adapter) {
        this.adapter = adapter;
    }

    /**
     * @param src 电源, 相对于对于充电器来说
     */
    public void connect(ElectricSocket src) {
        computer.setCharger(charger);
        if (adapter == null) {
            System.out.println("不需要适配器");
            charger.setElectricSocket(src);
        } else {
            adapter.setElectricSocket(src);
            charger.setElectricSocket(adapter);
        }
    }

    /**
     * 使用电脑, 开机
     */
    public void useComputer() {
        this.computer.startingUp();
    }
}