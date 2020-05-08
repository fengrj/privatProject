package com.example.design_patterns.zhuang_shi_zhe.test1;

/**
 * 装饰者分支 中间层
 */
public class Decorator extends Drink {
    //注意这里面有个超类的对象，因为这是个装饰者，
    //所以他包装的是一个单品，或者是一个被包装过的单品.所以他用个超类的类型
    private Drink Obj;

    //所以实现这个装饰者时必须带入这个Drink对象放进去
    public Decorator(Drink Obj) {
        this.Obj = Obj;
    }

    //这里的价格计算就有所跟单品不一样了。首先他要计算自己的价格，比如，巧克力，牛奶多少钱，还有要计算的就是前面
    //带入的主题的价格，如果是已包装过的，就变成了递归了，就迭代的计算所有价格，以级最终的单品价格
    @Override
    public float cost() {
        return super.getPrice() + Obj.cost();
    }

    @Override
    public String getDescription() {
        return super.description + "-" + super.getPrice() + "元 &&" + Obj.getDescription();
    }


}
