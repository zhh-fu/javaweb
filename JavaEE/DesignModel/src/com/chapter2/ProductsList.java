package com.chapter2;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class ProductsList extends Observable{

    private List<String> productList = null;
    private static ProductsList instance;

    private ProductsList(){}

    public static ProductsList getInstance() {
        if (instance==null){
            instance=new ProductsList();
            instance.productList = new ArrayList<String>();
        }
        return instance;
    }

    public void addProductObserver(Observer observer){
        this.addObserver(observer);
    }
    public void addProduct(String newProduct){
        productList.add(newProduct);
        this.setChanged();
        this.notifyObservers(newProduct);
    }
}

