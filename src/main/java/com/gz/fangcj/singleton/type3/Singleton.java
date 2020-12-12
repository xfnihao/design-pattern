package com.gz.fangcj.singleton.type3;

/**
 * 单例模式:双重检查锁(推荐使用)
 * @Author Fang chenjiang
 * @Date 2020/12/12
 */
public class Singleton {

    public  static  volatile  Singleton singleton;
    private Singleton(){

    }

    public  static   Singleton getSingleton(){
        if (singleton==null){
            synchronized (Singleton.class){
                if (singleton==null){
                    singleton=new Singleton();
                }
            }
        }
        return singleton;
    }
}
