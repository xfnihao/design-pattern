package com.gz.fangcj.singleton.type1;

/**
 * 单例模式
 * 饿汉式:JVM在加载类就创建对象实例
 * 优点:线程安全，保证全局唯一一份
 * 缺点:若生成的唯一实例不用，会造成资源浪费
 * @Author Fang chenjiang
 * @Date 2020/12/12
 */

public class Singleton {

     //保证全局唯一实例
     public  final static Singleton singleton=new Singleton();

     /**
      * 构造器私有
      */
     private Singleton(){

     }
     //静态方法获取
     public static Singleton  getSingleton(){
          return  singleton;
     }


     public static void main(String[] args) {


          Singleton singleton = Singleton.getSingleton();
          Singleton singleton1 = Singleton.getSingleton();
          System.out.println(singleton==singleton1);   //true

     }
}
