package com.example.design_patterns.zhuang_shi_zhe.test2;

/**
 * 加一根肠需要加3元
 */
public class AddSusageCake implements Cake {

    private Cake cake;

    public AddSusageCake(Cake cake){
        this.cake = cake;
    }

    @Override
    public String getCake() {
        return cake.getCake() + " + 肠";
    }

    @Override
    public double getPrice() {
        return cake.getPrice() + 3;
    }
}
