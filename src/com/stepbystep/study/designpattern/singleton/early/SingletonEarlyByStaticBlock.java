package com.stepbystep.study.designpattern.singleton.early;

/**
 * @Author Duole
 * @Version 1.0
 */
public class SingletonEarlyByStaticBlock {
    private SingletonEarlyByStaticBlock() {

    }

    private static SingletonEarlyByStaticBlock instance;

    static {
        instance = new SingletonEarlyByStaticBlock();
    }

    public static SingletonEarlyByStaticBlock getInstance() {
        return instance;
    }
}
