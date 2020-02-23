package com.ssm.pojo;

public class Juice {
    private String shop=null;
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
