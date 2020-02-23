package com.bean;

import java.io.Serializable;

public class Choose implements Serializable {                  //没有方法需要去实现，只是告诉java虚拟机它可以被序列化
    private static final long serialVersionUID=1;
    private String[] language;
    private String[] techlogy;
    private String[] part;
    //private boolean isEmail;

    public Choose(){}

    /*public boolean isEmail() {
        String regex = "\\w+([-+.']\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*";
        if (mailAdd.matches(regex))
            isEmail=true;
        return isEmail;
    }*/

    public void setLanguage(String[] language) {
        this.language = language;
    }

    public String[] getLanguage() {
        return language;
    }

    public void setPart(String[] part) {
        this.part = part;
    }

    public String[] getPart() {
        return part;
    }

    public void setTechlogy(String[] techlogy) {
        this.techlogy = techlogy;
    }

    public String[] getTechlogy() {
        return techlogy;
    }
}
