package com.gz.fangcj.prototype;


/**
 * 原型模式：
 * Java中的Object类提供了一个clone()方法，该方法可以将一个Java对象复制一份，但是需要
 * 实现clone的Java类必须要实现一个接口Cloneable，该接口表示该类能够复制且具有复制的能力
 * 对于创建过程困难和耗时等情况，使用原型模式能够提升创建的效率
 *
 * Prototype(原型模式)在Spring中的运用:
 * 在Spring中，我们可以手动将Bean的scope设置为prototype，表示在Spring容器启动时，会创建多个Bean实例
 * 而内部的实现过程，也是基于原型模式设计
 * @Author Fang chenjiang
 * @Date 2020/12/23
 */
public class Prototype {
    public static void main(String[] args) throws CloneNotSupportedException {

        //传统方式:获取多个属性相同的对象
//        Sheep sheep1 = new Sheep("xf", 1, "black");
//        Sheep sheep2 = new Sheep(sheep1.getName(), sheep1.getAge(), sheep1.getColor());
//        Sheep sheep3 = new Sheep(sheep1.getName(), sheep1.getAge(), sheep1.getColor());
//        Sheep sheep4 = new Sheep(sheep1.getName(), sheep1.getAge(), sheep1.getColor());
//        Sheep sheep5 = new Sheep(sheep1.getName(), sheep1.getAge(), sheep1.getColor());

        //原型模式:实现一个接口Cloneable
        Sheep sheep=new Sheep("xf",1,"white");


        Sheep sheep2 = (Sheep) sheep.clone();
        Sheep sheep3 = (Sheep) sheep.clone();
        Sheep sheep4 = (Sheep) sheep.clone();
        Sheep sheep5 = (Sheep) sheep.clone();

        System.out.println(sheep==sheep2);
//        System.out.println(sheep3);
//        System.out.println(sheep4);
//        System.out.println(sheep5);




    }
}
