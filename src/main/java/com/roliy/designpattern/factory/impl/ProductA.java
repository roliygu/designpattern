package com.roliy.designpattern.factory.impl;

import com.roliy.designpattern.factory.Product;

public class ProductA implements Product {

    private String special;

    public void work() {
        System.out.println("I'm product A");
        if (special != null) {
            System.out.println(String.format("\twith special: %s", special));
        }
    }

    @Override
    public void setSpecial(String special) {
        this.special = special;
    }

}
