package com.king.patterns.multi_static_method_simple_factory;

public class Main {
    public static void main(String[] args) {
        Sender sender = SendFactory.produceMail();
        sender.Send();
    }
}