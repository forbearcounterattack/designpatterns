package com.stepbystep.study.designpattern.singleton.early;

/**
 * @Author Duole
 * @Version 1.0
 */
public class SingletonTest01 {
    public static void main(String[] args) {
        SingletonEarly instance = SingletonEarly.getInstance();
        SingletonEarly instance1 = SingletonEarly.getInstance();
        System.out.println(instance == instance1);

        SingletonEarlyByStaticBlock in1 = SingletonEarlyByStaticBlock.getInstance();
        SingletonEarlyByStaticBlock in2 = SingletonEarlyByStaticBlock.getInstance();
        System.out.println(in1 == in2);


    }
}
