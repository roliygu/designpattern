package com.roliy.designpattern.decorator.impl;

import com.roliy.designpattern.decorator.Component;

// 可以被装饰的类，或者需要被装饰的类
public class ConcreteComponent implements Component {

    @Override
    public void operation() {
        System.out.println("origin component");
    }

}
