package com.gz.fangcj.factory.simple;

/**
 * 简单工厂：
 * 1.工厂类角色:本模式核心，含有一定的商业逻辑和判断逻辑，用来创建产品
 * 2.抽象产品类：一般是具体产品继承的父类或者实现的接口
 * 3.具体产品类角色：工厂类所创建的对象就是此角色对象。由Java中的某个具体类实现
 *
 * @Author Fang chenjiang
 * @Date 2020/12/23
 */
public class SimpleFactory {

    /**
     * 工厂具体创建过程
     * @param type
     * @return
     */
    public static BMW createBWM(Integer type){
        switch (type){
            case 320:
                return new BMW320();
            case 523:
                return new BMW523();
                default:
                    break;

        }
        return null;
    }
}
