package com.chapter2;

import java.lang.reflect.Method;

public class Reflect {

    private String name;

    public Reflect(String name){
        this.name=name;
    }

    public void sayHello(){
        System.err.println("Hello" + name);
    }

    public Reflect getInstace(){
        Reflect object = null;
        try{
            object = (Reflect)
                    Class.forName("com.chapter2.Reflect").getConstructor(String.class).
                            newInstance("张三");
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
        return object;
    }

    public Object reflect(){
        Object returnObj = null;
        Reflect target = getInstace();
        try{
            Method method = Reflect.class.getMethod("sayHello");
            returnObj = ((Method) method).invoke(target);
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
        return returnObj;
    }

//    public static void main(String[] args){
//        new Reflect("李四").reflect();
//    }
    public static void main(String[] args){
        ProductsList observable = ProductsList.getInstance();
        JingdongObserver jingdongObserver=new JingdongObserver();
        observable.addProductObserver(jingdongObserver);
        observable.addProduct("爆炸大虾");
    }
}
