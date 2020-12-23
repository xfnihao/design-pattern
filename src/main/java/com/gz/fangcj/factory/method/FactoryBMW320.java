package com.gz.fangcj.factory.method;

/**
 * 具体工厂类
 * @Author Fang chenjiang
 * @Date 2020/12/23
 */
public class FactoryBMW320  implements FactoryBMW {
    @Override
    public BMW createBMW() {
        return new  BMW320();
    }
}
