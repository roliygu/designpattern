package com.roliy.designpattern.decorator;

import com.roliy.designpattern.decorator.impl.ConcreteComponent;
import com.roliy.designpattern.decorator.impl.ConcreteDecoratorA;
import com.roliy.designpattern.decorator.impl.ConcreteDecoratorB;

public class Client {

    static public void main(String[] args) {

        Component coffee = new ConcreteComponent();
        coffee.operation();

        Component coffeeWithDecoratorA = new ConcreteDecoratorA(coffee);
        Component coffeeWithDecoratorAB = new ConcreteDecoratorB(coffeeWithDecoratorA);

        coffeeWithDecoratorAB.operation();

    }

}
