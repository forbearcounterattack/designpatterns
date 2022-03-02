package com.stepbystep.study.designpattern.factory.simplefactory;

/**
 * @Author Duole
 * @Version 1.0
 */
abstract class Coffee {
    public abstract String getName();

    public void addMilk(){
        System.out.println("add milk");
    }

    public void addSugar(){
        System.out.println("add Sugar");
    }
}
