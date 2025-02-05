package com.example.design_patterns.observer;

/**
 * 观察者
 *  * 实现了update方法
 */
public class User2 implements Observer {

    private String name;
    private String message;

    public User2(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        this.message = message;
        read();
    }

    public void read() {
        System.out.println(name + " 收到推送消息： " + message);
    }
}
