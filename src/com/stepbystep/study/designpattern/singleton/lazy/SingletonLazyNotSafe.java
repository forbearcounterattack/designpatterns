package com.stepbystep.study.designpattern.singleton.lazy;

/**
 * @Author Duole
 * @Version 1.0
 */
public class SingletonLazyNotSafe {
    private static SingletonLazyNotSafe instance;

    private SingletonLazyNotSafe() {

    }

    public static SingletonLazyNotSafe getInstance() {
        if (null == instance) {
            instance = new SingletonLazyNotSafe();
        }
        return instance;
    }
}
