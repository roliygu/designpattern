package com.roliy.designpattern.factory.abstractfactory;

public class ProductSeries1Factory implements AbstractFactory {

    @Override
    public AbstractProductA produceA() {
        return new ProductA1();
    }

    @Override
    public AbstractProductB produceB() {
        return new ProductB1();
    }

}
