package com.stepbystep.study.designpattern.factory.abstractfactory;

/**
 * @Author Duole
 * @Version 1.0
 */
public interface ClothesFactory {
    Shoes createShoes();

    Coat createCoat();
}
