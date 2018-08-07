package com.king.patterns.template_method;

public interface Template {
    void before();

    void run();

    void after();

    default void execute() {
        before();
        run();
        after();
    }
}