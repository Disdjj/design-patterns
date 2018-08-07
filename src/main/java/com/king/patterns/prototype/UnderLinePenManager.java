package com.king.patterns.prototype;

import java.util.HashMap;

public class UnderLinePenManager {
    /**
     * 各种笔注册到这里, 统一管理
     */
    private static final HashMap<String, Product> PENS = new HashMap<>();

    /**
     * 注册笔
     */
    public static void register(String name, Product pen) {
        PENS.put(name, pen);
    }

    /**
     * 从注册中心HashMap以name为key取出来一只笔, 然后克隆一个新的来返回
     */
    public static Product createPen(String name) {
        return PENS.get(name).createClone();
    }
}