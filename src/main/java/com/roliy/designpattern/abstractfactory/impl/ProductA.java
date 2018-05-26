package com.roliy.designpattern.abstractfactory.impl;

import com.roliy.designpattern.abstractfactory.Product;

public class ProductA implements Product {

    static public String identity() {
        return "ProductA";
    }

    public void work() {
        System.out.println("I'm product A");
    }
}
