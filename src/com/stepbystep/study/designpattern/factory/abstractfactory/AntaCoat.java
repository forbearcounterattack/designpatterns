package com.stepbystep.study.designpattern.factory.abstractfactory;

/**
 * @Author Duole
 * @Version 1.0
 */
public class AntaCoat extends Coat{
    public AntaCoat(){
        System.out.println("init AntaCoat");
    }
    @Override
    void show() {
        System.out.println("Anta coat");
    }
}
