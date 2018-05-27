package com.roliy.designpattern.factory.impl;

import com.roliy.designpattern.factory.Product;

public class ProductD implements Product {

    @Override
    public void work() {
        System.out.println("I'm Product D");
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
