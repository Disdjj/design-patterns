package com.king.patterns.strategy;

/**
 * 念魔咒策略
 */
public class SpellStrategy implements DragonSlayingStrategy {

    @Override
    public void execute() {
        System.out.println("魔咒策略: 念魔咒把龙封印掉");
    }
}