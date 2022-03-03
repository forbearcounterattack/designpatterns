package com.stepbystep.study.designpattern.factory.factorymethod;

/**
 * @Author Duole
 * @Version 1.0
 */
public class AmericanCoffeeFactory implements CoffeeFactory{
    @Override
    public Coffee createCoffee() {
        return new AmericanCoffee();
    }
}
