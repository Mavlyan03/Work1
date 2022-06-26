package com.company.service.serviceImpl;

public class MyException extends Throwable implements AutoCloseable {

    @Override
    public void close() throws Exception {}

    public void getWrongNumber() {
        System.err.println("You write wrong number");
    }
}
