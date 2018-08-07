package com.king.patterns.builder;

public class Main {
    public static void main(String[] args) {
        // 构建者
        TextBuilder textbuilder = new TextBuilder();

        // 指挥者
        Director director = new Director(textbuilder);

        // 构建
        director.construct();

        // 构建好的内容
        System.out.println(textbuilder.getResult());
    }
}
