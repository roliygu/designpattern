package com.roliy.designpattern.factory.abstractfactory;

/**
 * 抽象工厂解决的问题更复杂
 * Product的类层级至少是两层，ProductA/B是第一级，1/2是第二级
 */
public class Client {

    static public void main(String[] args) {

        AbstractFactory seriesFactory = new ProductSeries1Factory();

        AbstractProductA productA = seriesFactory.produceA();
        AbstractProductB productB = seriesFactory.produceB();
        productA.work();
        productB.work();

        seriesFactory = new ProductSeries2Factory();
        productA = seriesFactory.produceA();
        productB = seriesFactory.produceB();
        productA.work();
        productB.work();

    }

}
