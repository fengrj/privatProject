package com.example.design_patterns.zhuang_shi_zhe.test1;

/**
 * @author ceshi
 * @Title: ${file_name}
 * @Package ${package_name}
 * @Description: ${todo}
 * @date 2020/4/2817:39
 */
public class TestMain {


    public static void main(String[] args) {
        // 单品
        Drink coffee3 = new Decaf();
        coffee3 = new Chocolate(coffee3);
        coffee3 = new Mike(coffee3);

        System.out.println("描述：" + coffee3.getDescription());



    }
}
