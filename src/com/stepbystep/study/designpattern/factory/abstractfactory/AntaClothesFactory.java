package com.stepbystep.study.designpattern.factory.abstractfactory;

/**
 * @Author Duole
 * @Version 1.0
 */
public class AntaClothesFactory implements ClothesFactory {
    @Override
    public Shoes createShoes() {
        return new AntaShoes();
    }

    @Override
    public Coat createCoat() {
        return new AntaCoat();
    }
}
