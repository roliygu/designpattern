package com.roliy.designpattern.abstractfactory;

import com.roliy.designpattern.abstractfactory.impl.ProductA;
import com.roliy.designpattern.abstractfactory.impl.ProductB;

public class Factory {

    static public Product produce(String identity) {

        if (identity.equals(ProductA.identity())) {
            return new ProductA();
        } else if (identity.equals(ProductB.identity())) {
            return new ProductB();
        }

        throw new IllegalArgumentException("unknown identity");

    }

}
