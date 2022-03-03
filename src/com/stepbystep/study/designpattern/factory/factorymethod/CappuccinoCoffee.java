package com.stepbystep.study.designpattern.factory.factorymethod;

/**
 * @Author Duole
 * @Version 1.0
 */
public class CappuccinoCoffee extends Coffee {
    public CappuccinoCoffee(){
        System.out.println(" cappuccino coffee init");
    }
    @Override
    public String getName() {
        return "this is cappuccino coffee";
    }
}
