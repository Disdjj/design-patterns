package com.king.patterns.strategy;

/**
 * 屠龙勇士
 */
public class DragonSlayer {
    /**
     * 屠龙策略
     */
    private DragonSlayingStrategy strategy;

    /**
     * 如果是空参构造器, 那么赋上一个默认的策略
     */
    public DragonSlayer() {
        strategy = new DragonSlayingStrategy() {
            @Override
            public void execute() {
                System.out.println("默认策略: 拳打脚踢");
            }
        };
    }

    /**
     * 传入一个策略, 根据这个策略来进行实例化屠龙勇士
     */
    public DragonSlayer(DragonSlayingStrategy strategy) {
        this.strategy = strategy;
    }

    /**
     * 策略是可以随时变的, change一下就好了
     */
    public DragonSlayer changeStrategy(DragonSlayingStrategy strategy) {
        this.strategy = strategy;
        return this;
    }

    /**
     * 使用当前策略来执行屠龙
     */
    public void goToBattle() {
        this.strategy.execute();
    }
}