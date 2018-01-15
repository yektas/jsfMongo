package com.trnet.spring.utils;

public class Generator {

    public int getRandomInt(int min, int max){
        return (int) (Math.floor(Math.random() * (max - min + 1)) + min);
    }
}
