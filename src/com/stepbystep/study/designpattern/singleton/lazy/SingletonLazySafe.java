package com.stepbystep.study.designpattern.singleton.lazy;

/**
 * @Author Duole
 * @Version 1.0
 */
public class SingletonLazySafe {
    private static SingletonLazySafe instance;

    private SingletonLazySafe() {

    }

    public static synchronized SingletonLazySafe getInstance() {
        if (null == instance) {
            instance = new SingletonLazySafe();
        }
        return instance;
    }
}

