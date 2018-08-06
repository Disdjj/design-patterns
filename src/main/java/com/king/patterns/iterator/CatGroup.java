package com.king.patterns.iterator;

/**
 * Cat是个体, 一个Cat实例代表一只猫.
 * CatGroup是Cat的集合, 一个CatGroup实例代表一群猫.
 *
 * 并且这个类实现了Aggregate的iterator()方法来获取迭代器
 */
public class CatGroup implements Aggregate {
 
    private int last;
    private Cat[] cats;
 
    public CatGroup(int maxsize) {
        this.cats = new Cat[maxsize];
    }
 
    public Cat getByIndex(int index) {
        return cats[index];
    }
 
    public void append(Cat cat) {
        cats[last++] = cat;
    }
 
    public int getLength() {
        return last;
    }
 
    @Override
    public Iterator iterator() {
        return new CatGroupIterator(this);
    }
}