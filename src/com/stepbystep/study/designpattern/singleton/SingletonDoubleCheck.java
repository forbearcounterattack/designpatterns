package com.stepbystep.study.designpattern.singleton;

/**
 * @Author Duole
 * @Version 1.0
 */
public class SingletonDoubleCheck {
    private static volatile SingletonDoubleCheck instance;

    private SingletonDoubleCheck() {
    }

    public static synchronized SingletonDoubleCheck getInstance() {
        if (null == instance) {
            synchronized (SingletonDoubleCheck.class) {
                if (null == instance) {
                    instance = new SingletonDoubleCheck();
                }
            }
        }
        return instance;
    }
}
