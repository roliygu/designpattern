package com.roliy.designpattern.abstractfactory;

public class Client {

    static public void main(String[] args) {
        Product productA = Factory.produce("ProductA");
        productA.work();
    }

}
