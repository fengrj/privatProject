package com.example.thread.synchronizedTest;


public class SyncThreadStaticMain {

    public static void main(String args[]) {
        SyncThreadStatic syncThread1 = new SyncThreadStatic();
        SyncThreadStatic syncThread2 = new SyncThreadStatic();


        /**
         * 当synchronized 锁静态方法
         *  静态方法是属于类的，所以syncThread1和syncThread2相当于用了同一把锁。
         */
//        顺序执行
        Thread thread1 = new Thread(syncThread1, "线程AA");
        Thread thread2 = new Thread(syncThread2, "线程BBB");
        thread1.start();
        thread2.start();


    }
}
