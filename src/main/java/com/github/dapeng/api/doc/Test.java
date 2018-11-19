package com.github.dapeng.api.doc;

import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 描述:
 *
 * @author maple.lei
 * @date 2018年02月11日 上午9:48
 */
public class Test {
    private ReentrantLock lock = new ReentrantLock();
    private Condition t1 = lock.newCondition();
    private Condition t2 = lock.newCondition();

    public void thread1() throws InterruptedException {

        new Thread(() -> {
            try {
                lock.lock();
                    while (true) {


                        try {
                            System.out.println("notify thread wait 2000");
                            TimeUnit.SECONDS.sleep(2);
                            System.out.println("wait already");
                            t2.signal();
                            t1.await();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
            } finally {
                lock.unlock();
            }
        }).start();


        new Thread(() -> {
            try {
                lock.lock();
                int i = 0;
                while (true) {
                    try {
                        System.out.println("获取结果集！" + i++);
                        int chance = new Random().nextInt(100);
                        if (chance < 2) throw new RuntimeException("故意抛出异常");
                    } catch (RuntimeException e) {
                        e.printStackTrace();
                        t1.signal();
                        try {
                            t2.await();
                        } catch (InterruptedException e1) {
                            e1.printStackTrace();
                        }

                    }
                    System.out.println("do something");
                }
            } finally {
                lock.unlock();
            }
        }).start();
    }

    public static void main(String[] args) throws InterruptedException {
        /*Test t = new Test();
        t.thread1();*/

        System.out.println((byte)0x02);
        System.out.println(0x03);




    }
}
