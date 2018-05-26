package com.roliy.designpattern.decorator.impl;

import com.roliy.designpattern.decorator.Component;
import com.roliy.designpattern.decorator.Decorator;

public class ConcreteDecoratorA extends Decorator {

    public ConcreteDecoratorA(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        super.operation();
        System.out.println("Decorator with A");
    }
}
