package com.roliy.designpattern.factory.impl;

public enum ProductEnum {

    ProductA("ProductA", 1), ProductB("ProductB", 2), ProductC("ProductC", 3), ProductD("ProductD", 4);

    private String name;
    private int index;

    ProductEnum(String name, int index) {
        this.name = name;
        this.index = index;
    }

}
