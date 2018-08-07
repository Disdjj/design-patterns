package com.king.patterns.factory_method;

public abstract class Factory {
    /**
     * 这里定义执行模板
     */
    public final Product create(String owner) {
        Product p = createProduct(owner);
        registerProduct(p);
        return p;
    }

    /**
     * 创建产品. 留给子类来实现
     */
    protected abstract Product createProduct(String owner);

    /**
     * 注册产品. 留给子类来实现
     */
    protected abstract void registerProduct(Product p);

}