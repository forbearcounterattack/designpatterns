package com.stepbystep.study.designpattern.factory.abstractfactory;

/**
 * @Author Duole
 * @Version 1.0
 */
public class LiningClothesFactory implements ClothesFactory{
    @Override
    public Shoes createShoes() {
        return new LiningShoes();
    }

    @Override
    public Coat createCoat() {
        return new LiningCoat();
    }
}
