package com.king.patterns.factory_method;

import java.util.ArrayList;

public class IDCardFactory extends Factory {
    private ArrayList<String> owners = new ArrayList<>();

    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }

    @Override
    protected void registerProduct(Product p) {
        owners.add(((IDCard) p).getOwner());
    }
}
