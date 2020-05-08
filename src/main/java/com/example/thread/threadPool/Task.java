package com.example.thread.threadPool;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Task implements Runnable {
    private static final Logger logger = LoggerFactory.getLogger(Task.class);

    private int num;
    public Task(int num) {
        this.num = num;
    }

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        System.out.println(name+ "--------------正在执行任务  " + num);
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("线程" + num + "执行完毕");
    }
}
