package com.king.patterns.strategy;

/**
 * 火器策略
 */
public class FireStrategy implements DragonSlayingStrategy {
    @Override
    public void execute() {
        System.out.println("火器策略: 用火烧");
    }
}