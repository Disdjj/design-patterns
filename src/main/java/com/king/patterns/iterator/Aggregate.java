package com.king.patterns.iterator;

/**
 * 该接口中只有一个方法, 这个方法用于生成一个迭代器, 并返回
 * <p>
 * 如果某个集合想使用迭代器, 那么就就应该实现这个接口
 */
public interface Aggregate {
    public abstract Iterator iterator();
}