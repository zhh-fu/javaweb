package com.ssm.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("source")
public class Source {
    @Value("橙汁")
    private String fruit;
    @Value("少糖")
    private String sugar;
    @Value("大杯")
    private String cupSize;

    public String getFruit() {
        return fruit;
    }

    public void setFruit(String fruit) {
        this.fruit = fruit;
    }

    public String getSugar() {
        return sugar;
    }

    public void setSugar(String sugar) {
        this.sugar = sugar;
    }

    public void setCupSize(String cupSize) {
        this.cupSize = cupSize;
    }

    public String getCupSize() {
        return cupSize;
    }
}
