package com.stepbystep.study.designpattern.factory.staticfactory;

/**
 * @Author Duole
 * @Version 1.0
 */
public class CoffeeStore {
    public Coffee orderCoffee(String coffeeName){
        Coffee coffee = CoffeeFactory.createCoffee(coffeeName);
        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }
}
