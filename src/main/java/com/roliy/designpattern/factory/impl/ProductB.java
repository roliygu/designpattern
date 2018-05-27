package com.roliy.designpattern.factory.impl;

import com.roliy.designpattern.factory.Product;

public class ProductB implements Product {

    public void work() {
        System.out.println("I'm product B");
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
