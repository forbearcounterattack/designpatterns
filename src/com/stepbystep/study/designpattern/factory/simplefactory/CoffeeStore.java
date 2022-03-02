package com.stepbystep.study.designpattern.factory.simplefactory;

/**
 * @Author Duole
 * @Version 1.0
 */
public class CoffeeStore {
    public Coffee orderCoffee(String coffeeName){
        CoffeeFactory coffeeFactory = new CoffeeFactory();
        Coffee coffee = coffeeFactory.createCoffee(coffeeName);
        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }
}
