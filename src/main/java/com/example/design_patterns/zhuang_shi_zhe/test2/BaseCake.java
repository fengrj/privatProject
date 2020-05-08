package com.example.design_patterns.zhuang_shi_zhe.test2;

/**
 * 一个普通的手抓饼五元一个
 */
public class BaseCake implements Cake {

    @Override
    public String getCake() {
        return "手抓饼";
    }

    @Override
    public double getPrice() {
        return 5;
    }
}
