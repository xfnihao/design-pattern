package com.gz.fangcj.builder;

/**
 * @Author Fang chenjiang
 * @Date 2021/1/3
 */
public class HouseDirector {
    private HouseBuilder houseBuilder=null;


//    public  HouseDirector(HouseBuilder houseBuilder){
//        this.houseBuilder=houseBuilder;
//
//    }

    //指挥指定制作流程
    public House constructHouse(){
        houseBuilder.buidBasic();
        houseBuilder.buildWall();
        houseBuilder.roofed();
        return houseBuilder.buildHouse();
    }

    public HouseBuilder getHouseBuilder() {
        return houseBuilder;
    }

    public void setHouseBuilder(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }
}
