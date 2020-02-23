package com.bean;
import java.io.UnsupportedEncodingException;

public class CharactorEncoding {
    public CharactorEncoding(){
    }

    public String arrayToString(String[] str) {
        StringBuffer text=new StringBuffer();
        if (str!=null&&str.length>0)
        {
            for (String arr:str)
            {
                text.append(arr);
                text.append(",");
            }
            if (text.length()>0)
                text.deleteCharAt(text.length()-1);
        }
        return text.toString();
    }
}
