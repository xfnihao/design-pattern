package com.gz.fangcj.singleton.type2;

/**
 * 单例模式
 * 懒汉式(解决线程安全问题)
 * @Author Fang chenjiang
 * @Date 2020/12/12
 */
public class Singleton {

    public  static  Singleton singleton;

    private Singleton(){


    }

    /**
     * synchronized同步机制解决线程安全问题：
     * 优点:解决线程安全问题
     * 缺点:
     * getSingleton其实只执行一次就足够了
     * 显然这种方法效率太低，不推荐使用
     *
     * @return
     */
    public synchronized static  Singleton getSingleton(){

        if (singleton==null)
        {
            singleton=new Singleton();
        }
       return singleton;
    }

    public static void main(String[] args) {

//        Singleton singleton = Singleton.getSingleton();
//        Singleton singleton1 = Singleton.getSingleton();
//        System.out.println(singleton==singleton1);

    }
}
