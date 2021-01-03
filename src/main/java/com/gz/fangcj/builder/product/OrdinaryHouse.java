package com.gz.fangcj.builder.product;

import com.gz.fangcj.builder.HouseBuilder;

/**
 * @Author Fang chenjiang
 * @Date 2021/1/3
 */
public class OrdinaryHouse extends HouseBuilder {
    @Override
    public void buidBasic() {

        System.out.println("普通房子打地基");

    }

    @Override
    public void buildWall() {
        System.out.println("普通房子砌墙");
    }

    @Override
    public void roofed() {
        System.out.println("普通房子封顶");
    }
}
