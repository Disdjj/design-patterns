package com.king.patterns.iterator;

/**
 * 迭代器接口
 */
public interface Iterator {
    public abstract boolean hasNext();

    public abstract Object next();
}