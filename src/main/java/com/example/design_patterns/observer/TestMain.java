package com.example.design_patterns.observer;

/**
 * @author ceshi
 * @Title: ${file_name}
 * @Package ${package_name}
 * @Description: ${todo}
 * @date 2020/4/2816:53
 */
public class TestMain {




    public static void main(String[] args) {
        /**
         * 业务要求:
         *  有一个微信公众号服务，不定时发布一些消息，关注公众号就可以收到推送消息，取消关注就收不到推送消息
         */
        WechatServer server = new WechatServer();

        Observer userZhang = new User("ZhangSan");
        server.registerObserver(userZhang);

        Observer userLi = new User("LiSi");
        server.registerObserver(userLi);


        Observer userWang = new User("WangWu");
        server.registerObserver(userWang);


        server.setInfomation("PHP是世界上最好用的语言！");



        System.out.println("----------------------------------------------");
        server.removeObserver(userZhang);
        server.setInfomation("JAVA是世界上最好用的语言！");


    }




}
