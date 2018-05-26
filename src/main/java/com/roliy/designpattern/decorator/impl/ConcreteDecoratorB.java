package com.roliy.designpattern.decorator.impl;

import com.roliy.designpattern.decorator.Component;
import com.roliy.designpattern.decorator.Decorator;

public class ConcreteDecoratorB extends Decorator {

    public ConcreteDecoratorB(Component component){
        super(component);
    }

    @Override
    public void operation() {
        super.operation();
        System.out.println("Decorator with B");
    }
}
