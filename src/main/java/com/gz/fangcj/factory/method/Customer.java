package com.gz.fangcj.factory.method;

/**
 *工厂方法去掉简单工厂中的静态属性，使得它可以被继承/实现。这样集中在简单工厂中的创建压力就可以均分到工厂方法中的具体工厂类中
 * 说白了：工厂方法就是再简单工厂的基础上，去掉集中处理的静态属性，再抽象出一个工厂接口让具体工厂类进行实现
 * @Author Fang chenjiang
 * @Date 2020/12/23
 */
public class Customer {
    public static void main(String[] args) {

        //创建具体工厂类
        FactoryBMW  factoryBMW320=new FactoryBMW320();
        BMW bmw320BMW = factoryBMW320.createBMW();


        FactoryBMW factoryBMW523=new FactoryBMW523();
        BMW factoryBMW523BMW = factoryBMW523.createBMW();


    }
}
