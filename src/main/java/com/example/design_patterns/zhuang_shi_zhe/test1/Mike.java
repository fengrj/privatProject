package com.example.design_patterns.zhuang_shi_zhe.test1;

/**
 * 调料装饰者
 */
public class Mike extends Decorator {

    public Mike(Drink Obj) {
        super(Obj);
        super.setDescription("配品Mike");
        super.setPrice(3.0f);
    }

}
