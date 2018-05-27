package com.roliy.designpattern.factory.factorymethod;

import com.roliy.designpattern.factory.Product;
import com.roliy.designpattern.factory.impl.ProductA;

public class ProductACreator extends Creator {

    @Override
    protected Product produce() {
        return new ProductA();
    }

}
