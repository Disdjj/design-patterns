package com.king.patterns.template_method;

public class TemplateImpl implements Template {
    @Override
    public void before() {
        System.out.println("Before..");
    }

    @Override
    public void run() {
        System.out.println("run..");
    }

    @Override
    public void after() {
        System.out.println("after..");
    }
}