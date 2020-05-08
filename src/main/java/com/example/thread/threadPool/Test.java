package com.example.thread.threadPool;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.*;

public class Test {


    private static final Logger logger = LoggerFactory.getLogger(Test.class);


    public static void main(String[] args) {


        ThreadPoolExecutor threadPool = ThreadPool.newSingleThreadExecutor("统计订单");

        for (int i = 0; i < 15; i++) {
            Task task = new Task(i);
            threadPool.execute(task);
            System.out.println(
                    "线程池中线程数目：" + threadPool.getPoolSize() +
                    "，队列中等待执行的任务数目：" + threadPool.getQueue().size() +
                    "，已执行玩别的任务数目：" + threadPool.getCompletedTaskCount());
        }
        threadPool.shutdown();
    }









}
