package com.example.design_patterns.zhuang_shi_zhe.test2;


public class TestMain {


    public static void main(String[] args) {
        //普通手抓饼
        Cake cake1 = new BaseCake();
        System.out.println("手抓饼：" + cake1.getCake() + "，需要支付" + cake1.getPrice() + "元");

        //手抓饼+鸡蛋
        Cake cake2 = new BaseCake();
        cake2 = new AddEggCake(cake2);
        System.out.println("手抓饼+鸡蛋：" + cake2.getCake() + "，需要支付" + cake2.getPrice() + "元");

        //手抓饼+ 2个鸡蛋 + 一根肠
        Cake cake3 = new BaseCake();
        cake3 = new AddEggCake(cake3);
        cake3 = new AddEggCake(cake3);
        cake3 = new AddSusageCake(cake3);
        System.out.println("手抓饼+2个鸡蛋+一根肠：" + cake3.getCake() + "，需要支付" + cake3.getPrice() + "元");


    }
}
