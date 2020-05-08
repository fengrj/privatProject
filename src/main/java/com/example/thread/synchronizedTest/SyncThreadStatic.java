package com.example.thread.synchronizedTest;


/**
  * synchronized 锁 静态方法
  * @param
  * @return
  * @author RenJie
  * @date  2019/12/6 17:09
  */
public class SyncThreadStatic implements Runnable {

    private static int count;

    public SyncThreadStatic() {
        count = 0;
    }


    public synchronized static void method() {
            for (int i = 0; i < 5; i++) {
                try {
                    System.out.println(Thread.currentThread().getName() + ":" + (count++));
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
    }

    @Override
    public void run() {
        method();

    }

    public int getCount() {
        return count;
    }
}
