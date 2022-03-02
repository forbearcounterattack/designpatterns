package com.stepbystep.study.designpattern.singleton.early;

/**
 * @Author Duole
 * @Version 1.0
 */
class SingletonEarly {
    private SingletonEarly(){

    }

    private final static SingletonEarly instance = new SingletonEarly();

    public static SingletonEarly getInstance(){
        return instance;
    }
}
