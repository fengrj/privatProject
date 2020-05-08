package com.example.design_patterns.zhuang_shi_zhe.test2;

/**
 * 加一个鸡蛋需要加2元
 */
public class AddEggCake implements Cake {

    private Cake cake;

    public AddEggCake(Cake cake){
        this.cake = cake;
    }

    @Override
    public String getCake() {
        return cake.getCake() + " + 鸡蛋";
    }

    @Override
    public double getPrice() {
        return cake.getPrice() + 2;
    }
}
