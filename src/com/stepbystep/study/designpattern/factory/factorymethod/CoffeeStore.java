package com.stepbystep.study.designpattern.factory.factorymethod;

/**
 * @Author Duole
 * @Version 1.0
 */
public class CoffeeStore {
    private CoffeeFactory coffeeFactory;

    public void SetCoffeeFactory(CoffeeFactory factory) {
        this.coffeeFactory = factory;
    }

    public Coffee orderCoffee() {
        Coffee coffee = this.coffeeFactory.createCoffee();
        coffee.addMilk();
        coffee.addSugar();
        return coffee;

    }
}
