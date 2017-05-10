package com.company;

/**
 * Created by ridita on 5/9/17.
 */
public class FirstHalf {

    public String firstHalf(String str) {
        int newLength = str.length() / 2;
        return str.substring(0, newLength);
    }

}