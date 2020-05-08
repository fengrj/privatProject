package com.example.design_patterns.zhuang_shi_zhe.test1;


/**
 * 首先定一个Drink超类，抽象类 ；在抽象类的基础上扩展出两个分支，
 * 1. 一个是咖啡的单品 ，这里咖啡可以设置个中间层，这里实现了中间层，Coffee中间层，这个中间层把单品的公有功能放进去了；
 * 2.一个是调料，
 * 装饰者分支Decorator，这个装饰者本身就是个中间层，在这Decorator里面实现共有功能，具体的调料去继承这个中间层去实现即可
 * 这样，代码接口就比较清晰了
 */

public abstract class Drink {
    //这个描述具体扩展出是什么单品或调料
      String description = "";
    //这里是具体的单品或调料的价格
    private float price = 0f;

    //这个是用抽象是因为，在单品种直接返回价格即可，
    //但在调料中，调料是不能单独存在的,是跟着实体，具体实体一起的，价格不仅是调料还有单品的价格，调料cost方法是是要递归去获取所有调料的价格
    public abstract float cost();



    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return "[ "+description + " -价格 " + this.getPrice()+" ]";
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }



}
