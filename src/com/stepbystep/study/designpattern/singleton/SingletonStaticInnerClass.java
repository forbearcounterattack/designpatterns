package com.stepbystep.study.designpattern.singleton;

/**
 * @Author Duole
 * @Version 1.0
 */
public class SingletonStaticInnerClass {
    private SingletonStaticInnerClass() {

    }

    private static class SingletonInstance {
        private static final SingletonStaticInnerClass INSTANCE = new SingletonStaticInnerClass();
    }

    public static SingletonStaticInnerClass getInstance() {

        return SingletonInstance.INSTANCE;
    }
}
