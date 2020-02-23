package com.ssm.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("juice")
public class Juice {
    @Value("贡茶")
    private String shop=null;
    @Autowired
    private Source source=null;

    public String getShop() {
        return shop;
    }

    public void setShop(String shop) {
        this.shop = shop;
    }

    public Source getSource() {
        return source;
    }

    public void setSource(Source source) {
        this.source = source;
    }

    public String makeJuice(){
        String juice = "这是一杯来自" + shop + "饮品店提供的" + source.getSugar() + source.getCupSize() + source.getFruit();
        return juice;
    }
}