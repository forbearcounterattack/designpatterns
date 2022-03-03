package com.stepbystep.study.designpattern.factory.factorymethod;

import javax.swing.plaf.synth.SynthOptionPaneUI;

/**
 * @Author Duole
 * @Version 1.0
 */
public class AmericanCoffee extends Coffee {
    public AmericanCoffee(){
        System.out.println(" american coffee init");
    }
    @Override
    public String getName() {
        return "THIS IS AMERICAN COFFEE";
    }
}
