package com.gz.fangcj.factory.method;

/**
 * @Author Fang chenjiang
 * @Date 2020/12/23
 */
public class FactoryBMW523 implements  FactoryBMW {
    @Override
    public BMW createBMW() {
        return  new BMW523();
    }
}
