package com.gz.fangcj.builder;

import com.gz.fangcj.builder.product.OrdinaryHouse;

/**
 * 建造者模式：
 * Product(产品角色):一个具体的产品对象
 * Builder(抽象建造者):创建一个Product对象的各个部件指定的接口/抽象类
 * ConcreteBuilder(具体建造者):实现接口,构建和装配各个部件
 * Director(指挥者):构建一个实现Builder接口的对象。主要是用于创建一个复杂的对象。主要有两个作用:
 * 1:隔离了客户与对象的生产过程。2：负责控制产品对象的生产过程
 * @Author Fang chenjiang
 * @Date 2021/1/3
 */
public class Client {
    public static void main(String[] args) {

        OrdinaryHouse ordinaryHouse = new OrdinaryHouse();



        HouseDirector houseDirector = new HouseDirector();
        houseDirector.setHouseBuilder(ordinaryHouse);



        House house = houseDirector.constructHouse();


    }
}
