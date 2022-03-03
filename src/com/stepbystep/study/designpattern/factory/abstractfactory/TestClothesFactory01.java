package com.stepbystep.study.designpattern.factory.abstractfactory;

/**
 * @Author Duole
 * @Version 1.0
 */
public class TestClothesFactory01 {
    public static void main(String[] args) {

        //Lining产品族
        LiningClothesFactory liningClothesFactory = new LiningClothesFactory();
        Coat coat = liningClothesFactory.createCoat();
        coat.show();
        Shoes shoes = liningClothesFactory.createShoes();
        shoes.show();

        //Anta产品族
        AntaClothesFactory antaClothesFactory = new AntaClothesFactory();
        Coat coat1 = antaClothesFactory.createCoat();
        coat1.show();
        Shoes shoes1 = antaClothesFactory.createShoes();
        shoes1.show();

    }
}
