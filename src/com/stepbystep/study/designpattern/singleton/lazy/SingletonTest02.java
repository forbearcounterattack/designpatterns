package com.stepbystep.study.designpattern.singleton.lazy;

import com.stepbystep.study.designpattern.singleton.SingletonEnum;
import com.stepbystep.study.designpattern.singleton.SingletonStaticInnerClass;

/**
 * @Author Duole
 * @Version 1.0
 */
public class SingletonTest02 {
    public static void main(String[] args) {
        SingletonLazyNotSafe in1 = SingletonLazyNotSafe.getInstance();
        SingletonLazyNotSafe in2 = SingletonLazyNotSafe.getInstance();
        System.out.println(in1);
        System.out.println(in2);


        SingletonEnum singletonEnum1 = SingletonEnum.INSTANCE;
        SingletonEnum singletonEnum2 = SingletonEnum.INSTANCE;
        System.out.println(singletonEnum1 == singletonEnum2);


        System.out.println(SingletonStaticInnerClass.getInstance() == SingletonStaticInnerClass.getInstance());


    }
}

