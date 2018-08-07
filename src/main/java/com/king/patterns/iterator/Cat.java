package com.king.patterns.iterator;

/**
 * Cat是个体, 一个Cat实例代表一只猫.
 * CatGroup是Cat的集合, 一个CatGroup实例代表一群猫.
 */
public class Cat {
    private int age;
    private String name;

    public Cat(String name, int age) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}