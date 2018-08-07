package com.king.patterns.factory_method;

public class IDCard extends Product {
    private String owner;

    public IDCard(String owner) {
        this.owner = owner;
    }

    @Override
    public void use() {
        System.out.println(owner + "的ID卡");
    }

    public String getOwner() {
        return owner;
    }
}