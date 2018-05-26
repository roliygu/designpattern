package com.roliy.designpattern.abstractfactory.impl;

import com.roliy.designpattern.abstractfactory.Product;

public class ProductB implements Product {

    static public String identity() {
        return "ProductB";
    }

    public void work() {
        System.out.println("I'm product B");
    }
}
