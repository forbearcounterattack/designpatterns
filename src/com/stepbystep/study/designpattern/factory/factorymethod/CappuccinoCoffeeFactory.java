package com.stepbystep.study.designpattern.factory.factorymethod;

/**
 * @Author Duole
 * @Version 1.0
 */
public class CappuccinoCoffeeFactory implements CoffeeFactory{
    @Override
    public Coffee createCoffee() {
        return new CappuccinoCoffee();
    }
}
