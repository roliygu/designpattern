package com.roliy.designpattern.decorator.impl;

import com.roliy.designpattern.decorator.Component;

public class ConcreteComponent implements Component {

    @Override
    public void operation() {
        System.out.println("origin component");
    }
}
