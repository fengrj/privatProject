package com.example.design_patterns.zhuang_shi_zhe.test1;

//这是个具体主题分支上面的中间层
public class Coffee extends Drink {

    //在实现是直接返回价格即可，因为单品就单品一个，实现简单
    @Override
    public float cost() {
        return super.getPrice();
    }
}
