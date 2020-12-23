package com.gz.fangcj.factory.simple;

/**
 * @Author Fang chenjiang
 * @Date 2020/12/23
 */
public abstract class BMW {
    public BMW(){

    }

}


/**
 * 不同种类的宝马
 */
class BMW320 extends BMW {
    public BMW320(){
        System.out.println("制造=>BMW320");
    }

}

class BMW523 extends BMW {
    public BMW523(){
        System.out.println("制造=>523");
    }


}


