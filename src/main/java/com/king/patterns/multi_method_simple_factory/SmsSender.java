package com.king.patterns.multi_method_simple_factory;

public class SmsSender implements Sender {

    @Override
    public void Send() {
        System.out.println("this is sms sender!");
    }
}  