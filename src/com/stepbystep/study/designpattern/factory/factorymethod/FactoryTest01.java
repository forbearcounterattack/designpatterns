package com.stepbystep.study.designpattern.factory.factorymethod;

/**
 * @Author Duole
 * @Version 1.0
 */
public class FactoryTest01 {
    public static void main(String[] args) {

        CoffeeStore coffeeStore = new CoffeeStore();
        AmericanCoffeeFactory americanCoffeeFactory = new AmericanCoffeeFactory();

        coffeeStore.SetCoffeeFactory(americanCoffeeFactory);

        Coffee coffee = coffeeStore.orderCoffee();
        System.out.println(coffee.getName());

    }
}
