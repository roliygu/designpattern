package com.roliy.designpattern.factory.abstractfactory;

public class ProductSeries2Factory implements AbstractFactory {

    @Override
    public AbstractProductA produceA() {
        return new ProductA2();
    }

    @Override
    public AbstractProductB produceB() {
        return new ProductB2();
    }

}
