package com.example.design_patterns.Strategy;



public class TestMain {


    /**
     * 应用:
     * JDK中的策略设计模式-ThreadPoolExecutor构造函数中的  RejectedExecutionHandler属性
     * 1. new一个ThreadPoolExecutor对象，然后调用execute方法执行任务,execute的方法源码中大量使用 reject(command)方法
     * 2. reject方法 实际就是调用了ThreadPoolExecutor类中RejectedExecutionHandler类型的成员变量handler的方法
     * 3.RejectedExecutionHandler发现它是一个接口，只有一个方法
     * 实现类在在ThreadPoolExecutor类中，只是使用了静态内部类的形式：
     * CallerRunsPolicy 、AbortPolicy 、AbortPolicy 、DiscardOldestPolicy 是拒绝策略算法的具体实现。，此处直接在策略上下文环境直接使用静态内部类的方式实现了抽象的策略，也就是接口中算法的定义
     */
    public static void main(String[] args) {

        Strategy strategy = new ConcreteStrategyOne();
        StrategyContext strategyContext = new StrategyContext(strategy);
        strategyContext.execute();

        System.out.println(  "测试二..........." );

        strategy = new ConcreteStrategyTwo();
        strategyContext = new StrategyContext(strategy);
        strategyContext.execute();

    }
}
