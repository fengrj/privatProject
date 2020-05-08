package com.example.design_patterns.Strategy;


/**
 * 策略设计模式有三个角色之三:
 *   策略上下文(Context)角色：持有一个Strategy的引用，并且在某处调用了算法。
 */
public class StrategyContext {

    private Strategy strategy;

    StrategyContext(Strategy strategy) {
        this.strategy = strategy;
    }

    void execute() {
        //StrategyContext 的 execute 有许多事情要做
        System.out.println("------");

        //天啊，终于执行到算法这里了
        String result = strategy.run();
        System.out.println(result);

        //后续还有好多操作。。。
        System.out.println("======");
    }

}
