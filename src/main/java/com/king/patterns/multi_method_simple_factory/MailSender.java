package com.king.patterns.multi_method_simple_factory;

public class MailSender implements Sender {
    @Override
    public void Send() {
        System.out.println("this is mailsender!");
    }
}  