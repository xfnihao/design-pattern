package com.gz.fangcj.prototype;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

/**
 * @Author Fang chenjiang
 * @Date 2020/12/23
 */
@Data
@AllArgsConstructor
@ToString
public class Sheep  implements  Cloneable{

    private String name;
    private Integer age;
    private String color;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
