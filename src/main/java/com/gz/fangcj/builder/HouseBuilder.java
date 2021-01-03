package com.gz.fangcj.builder;

/**
 * @Author Fang chenjiang
 * @Date 2021/1/3
 */
public abstract class HouseBuilder {
    private House house = new House();

    //将建造的流程，抽象为方法
    public abstract void buidBasic();

    public abstract void buildWall();

    public abstract void roofed();


    //建造房子(产品)并返回
    public House buildHouse() {
        return house;
    }
}
