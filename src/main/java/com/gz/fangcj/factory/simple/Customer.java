package com.gz.fangcj.factory.simple;

/**
 * @Author Fang chenjiang
 * @Date 2020/12/23
 */
public class Customer {
    public static void main(String[] args) {

        BMW bwm320 = SimpleFactory.createBWM(320);
        BMW bwm523 = SimpleFactory.createBWM(523);
    }
}
