package com.example.thread.threadPool;


import java.util.concurrent.*;

public class ThreadPool {


    public static ThreadPoolExecutor newSingleThreadExecutor(String threadName) {
        int poolSize = 5;
        int queueSize = 10;

        ThreadPoolExecutor pool = new ThreadPoolExecutor(
                // 核心线程数
                poolSize,
                // 核心线程数 + 临时线程
                queueSize,
                // 最大空闲时间,默认用于非核心线程
                200,
                //超时的时间单
                TimeUnit.MILLISECONDS,
                // 等待执行的任务队列数
                new ArrayBlockingQueue<Runnable>(queueSize),
                //  线程的方式、定义线程名格式、是否后台执行
                new ThreadFactory() {
                    @Override
                    public Thread newThread(Runnable r) {
                        return null;
                    }
                },
                //策略方式       当没有空闲的线程处理任务，并且等待队列已满（当然这只对有界队列有效），再有新任务进来的话，就要做一些取舍了，而这个参数就是指定取舍策略的，有下面四种策略可以选择：
                new ThreadPoolExecutor.AbortPolicy());
        return pool;
    }


}
