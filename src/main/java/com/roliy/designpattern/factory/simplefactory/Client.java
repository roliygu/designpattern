package com.roliy.designpattern.factory.simplefactory;

import com.roliy.designpattern.factory.Product;
import com.roliy.designpattern.factory.impl.ProductEnum;

public class Client {

    static public void main(String[] args) {

        // 工厂的实例可以是一个单例
        SimpleFactory factory = new SimpleFactory();

        Product product = factory.produce(ProductEnum.ProductA);
        product.work();

        product = factory.produce(ProductEnum.ProductB);
        product.work();

    }

}
