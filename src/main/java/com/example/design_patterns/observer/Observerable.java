package com.example.design_patterns.observer;


/**
 * 抽象被观察者接口
 * 声明了添加、删除、通知观察者方法
 */
public interface Observerable {

    // 添加
    void registerObserver(Observer o);

    void removeObserver(Observer o);

    //通知
    void notifyObserver();

}
