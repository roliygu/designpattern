package com.roliy.designpattern.factory.impl;

import com.roliy.designpattern.factory.Product;

public class ProductC implements Product {

    @Override
    public void work() {
        System.out.println("I'm Product C");
        if (special != null) {
            System.out.println(String.format("\twith special: %s", special));
        }
    }

    private String special;

    @Override
    public void setSpecial(String special) {
        this.special = special;
    }

}
