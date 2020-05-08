package com.example.design_patterns.Strategy;


/**
 * 策略设计模式有三个角色之二:
 *   具体策略(ConcreteStrategy)角色：包装了相关的算法或行为。
 */
public class ConcreteStrategyOne implements Strategy {

    @Override
    public String run() {
        return "ConcreteStrategy  One 实现的算法";
    }


}
