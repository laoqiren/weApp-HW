package com.umis;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/*
 * 序列化是将pojo转化为json串
 * 反序列化将json串转化为序列化对象
 * 
 * rest 服务时返回的json串可直接实例化为对象，需要自己定义
 * jsonignore 可以屏蔽某些不要的字段
 * JsonIgnoreProperties 相当于批量化屏蔽，只将该类中含有的属性反序列化为pojo对象
 * 
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Quote {

    private String type;
    private Value value;

    public Quote() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Quote{" +
                "type='" + type + '\'' +
                ", value=" + value +
                '}';
    }
}