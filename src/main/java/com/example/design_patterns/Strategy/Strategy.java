package com.example.design_patterns.Strategy;

/**
 *
 * 策略设计模式有三个角色之一:
 * 抽象策略(Strategy)角色：这是一个抽象角色，通常由一个接口实现。此角色给出所有的具体策略类所需的接口。
 */
public interface Strategy {

    String run();
}
