package com.stepbystep.study.designpattern.factory.abstractfactory;

/**
 * @Author Duole
 * @Version 1.0
 */
public class AntaShoes extends Shoes {
    public AntaShoes() {
        System.out.println("init AntaShoes");
    }

    @Override
    public void show() {
        System.out.println("Anta shoes");
    }
}
