package com.roliy.designpattern.factory.simplefactory;

import com.roliy.designpattern.factory.Product;
import com.roliy.designpattern.factory.impl.ProductA;
import com.roliy.designpattern.factory.impl.ProductB;
import com.roliy.designpattern.factory.impl.ProductC;
import com.roliy.designpattern.factory.impl.ProductD;
import com.roliy.designpattern.factory.impl.ProductEnum;

/**
 * 简单工厂只是将创建的逻辑提取到SimpleFactory中
 */
public class SimpleFactory {

    public Product produce(ProductEnum type) {
        if (ProductEnum.ProductA.equals(type)) {
            // 可能需要一些其他参数来创建一个对象，额外的参数通过product的其他参数传入
            return new ProductA();
        } else if (ProductEnum.ProductB.equals(type)) {
            return new ProductB();
        } else if (ProductEnum.ProductC.equals(type)) {
            return new ProductC();
        } else if (ProductEnum.ProductD.equals(type)) {
            return new ProductD();
        }
        throw new IllegalArgumentException();
    }

}
