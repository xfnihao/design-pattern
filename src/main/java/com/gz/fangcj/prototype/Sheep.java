package com.gz.fangcj.prototype;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

/**
 * @author Fang chenjiang
 * @create 2020-12-24-10:11
 */
@Data
@ToString
@AllArgsConstructor
public class Sheep  implements   Cloneable{

    private String name;
    private Integer age;
    private String color;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
