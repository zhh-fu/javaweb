package com.test;

public class StringDeal {
    public static String stringChange(String str)
    {
        String newString = str.replaceAll("\r\n","<br>");
        newString = newString.replaceAll(" ","&nbsp;");
        return newString;
    }
}
