package com.stepbystep.study.designpattern.factory.abstractfactory;

/**
 * @Author Duole
 * @Version 1.0
 */
public class LiningCoat extends Coat{
    public LiningCoat(){
        System.out.println("init LiningCoat");
    }
    @Override
    void show() {
        System.out.println("Lining Coat");
    }
}
