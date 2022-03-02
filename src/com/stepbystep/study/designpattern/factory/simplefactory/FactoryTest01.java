package com.stepbystep.study.designpattern.factory.simplefactory;

/**
 * @Author Duole
 * @Version 1.0
 */
public class FactoryTest01 {
    public static void main(String[] args) {
        CoffeeStore coffeeStore = new CoffeeStore();
        try {
            Coffee coffee = coffeeStore.orderCoffee("american");
            System.out.println("you have a cup of " + coffee.getName());


        }catch (RuntimeException exception){
            System.out.println(exception.getMessage());
        }

    }
}
