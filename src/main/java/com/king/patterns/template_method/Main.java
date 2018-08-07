package com.king.patterns.template_method;

public class Main {
    public static void main(String[] args) {
        new TemplateImpl().execute();

        /*-********或者可以这样*********-*/

        new Template() {
            @Override
            public void before() {
                System.out.println("运行之前..");
            }

            @Override
            public void run() {
                System.out.println("运行中..");
            }

            @Override
            public void after() {
                System.out.println("运行收尾..");
            }
        }.execute();
    }
}