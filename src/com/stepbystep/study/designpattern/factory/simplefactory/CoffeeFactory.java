package com.stepbystep.study.designpattern.factory.simplefactory;

/**
 * @Author Duole
 * @Version 1.0
 */
public class CoffeeFactory {
    public Coffee createCoffee(String coffeeName) {
        Coffee coffee = null;
        if ("american".equals(coffeeName)) {
            coffee = new AmericanCoffee();
        } else if ("cappuccino".equals(coffeeName)) {
            coffee = new CappuccinoCoffee();
        }else{
            throw new RuntimeException("no such coffee");
        }
        System.out.println("begin create coffee:  " + coffeeName);
        return coffee;
    }
}
