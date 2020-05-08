package com.example.thread.synchronizedTest;

/**
 * @author ceshi
 * @Title: ${file_name}
 * @Package ${package_name}
 * @Description: ${todo}
 * @date 2019/12/616:21
 */
public class SyncThreadMain {

    public static void main(String args[]) {
//情况A  锁不生效   原因:  synchronized (this)  this的锁分别是2个对象 s1和s2
//		SyncThread s1 = new SyncThread();
//		SyncThread s2 = new SyncThread();
//		Thread t1 = new Thread(s1);
//        t1.setName("线程AAA ");
//
//		Thread t2 = new Thread(s2);
//        t2.setName("线程BBBB ");

//情况B  锁生效   一个线程走完 走另一个  synchronized (this)  this代表 s
        SyncThread s = new SyncThread();
        Thread t1 = new Thread(s);
        System.out.println( "线程Acc "+  s.hashCode()   );
        t1.setName("线程Acc ");
        Thread t2 = new Thread(s);
        System.out.println( "线程Bddd "+  s.hashCode()   );
        t2.setName("线程Bddd ");


        t1.start();
        t2.start();
    }
}
