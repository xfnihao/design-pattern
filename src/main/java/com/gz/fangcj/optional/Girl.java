package com.gz.fangcj.optional;

/**
 * @Author Fang chenjiang
 * @Date 2021/2/1
 */
public class Girl {


    private String name;
    public Girl(){

    }

    public Girl(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Girl{" +
                "name='" + name + '\'' +
                '}';
    }
}
