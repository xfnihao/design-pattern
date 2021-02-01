package com.gz.fangcj.optional;


import java.util.Optional;

/**
 * @Author Fang chenjiang
 * @Date 2021/2/1
 */
public class Main {
    public static void main(String[] args) {

        Girl girl = new Girl("小方");
        Optional<Girl> optionalGirl = Optional.of(girl);
        optionalGirl.orElse(new Girl("大神"));
        System.out.println(optionalGirl);
    }
}
