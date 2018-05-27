package com.roliy.designpattern.factory.factorymethod;

import com.roliy.designpattern.factory.Product;

/***
 * 工厂方法依赖于具体的工厂类，来决定创建的对象
 * 理论上来说，有多少种Product，就有多少种具体的ProductCreator
 * Client需要感知用到的ProductCreator，但是用到的还是Creator的接口
 */
public class Client {

    static public void main(String[] args) {

        Creator productACreator = new ProductACreator();
        Product product = productACreator.createProduct("1");
        product.work();

        product = productACreator.createProduct("2");
        product.work();

    }

}
