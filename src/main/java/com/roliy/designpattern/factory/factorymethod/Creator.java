package com.roliy.designpattern.factory.factorymethod;

import com.roliy.designpattern.factory.Product;

public abstract class Creator {

    // 子类实现，返回不同的Product实现
    protected abstract Product produce();

    /**
     * 工厂方法并不要求一定有这个具体方法
     * 这个方法起一个包装的作用，用来包装一些hook调用
     * special参数有值得考虑的地方：
     *      如果对于Product来说，他们的特异之处很明显，明显到可以分成两个不同的类，
     *      那么这里special参数是用来决定二级子类的判断条件，
     *      反之，special就仅仅是一级子类的不同实例对象的属性
     */
    public Product createProduct(String special) {
        Product res = produce();
        res.setSpecial(special);
        return res;
    }

}
