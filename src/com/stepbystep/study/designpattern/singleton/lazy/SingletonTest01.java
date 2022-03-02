package com.stepbystep.study.designpattern.singleton.lazy;

/**
 * @Author Duole
 * @Version 1.0
 */
public class SingletonTest01 {
    public static void main(String[] args) {
        SingletonLazyNotSafe in1 = SingletonLazyNotSafe.getInstance();
        SingletonLazyNotSafe in2 = SingletonLazyNotSafe.getInstance();
        System.out.println(in1);
        System.out.println(in2);


    }
}
