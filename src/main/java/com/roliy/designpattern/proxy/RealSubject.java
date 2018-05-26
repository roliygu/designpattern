package com.roliy.designpattern.proxy;

public class RealSubject implements Subject {

    @Override
    public void request() {
        System.out.println("post real request");
    }

}
