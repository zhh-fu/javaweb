package com.chapter2;

import java.util.Observable;
import java.util.Observer;

public class JingdongObserver implements Observer {
    String newProduct = null;
    @Override
    public void update(Observable o, Object newProduct) {
        this.newProduct = (String) newProduct;
        System.out.println(newProduct + "成功更新");
    }


}
