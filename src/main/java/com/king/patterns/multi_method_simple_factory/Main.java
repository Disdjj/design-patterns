package com.king.patterns.multi_method_simple_factory;

public class Main {

    public static void main(String[] args) {
        SendFactory factory = new SendFactory();
        Sender sender = factory.produceMail();
        sender.Send();
    }
}