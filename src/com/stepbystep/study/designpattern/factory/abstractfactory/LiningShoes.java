package com.stepbystep.study.designpattern.factory.abstractfactory;

/**
 * @Author Duole
 * @Version 1.0
 */
public class LiningShoes extends Shoes{
    public LiningShoes(){
        System.out.println("init LiningShoes");
    }
    @Override
    public void show() {
        System.out.println("Lining shoes");
    }
}
