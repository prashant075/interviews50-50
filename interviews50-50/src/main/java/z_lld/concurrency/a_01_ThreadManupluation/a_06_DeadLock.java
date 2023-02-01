package z_lld.concurrency.a_01_ThreadManupluation;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class a_06_DeadLock {

    private Lock lock1 = new ReentrantLock(true);
    private Lock lock2 = new ReentrantLock(true);

    public void worker1()  {
        lock1.lock();
        System.out.println("Worker1 Accqurie the Lock1");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        lock2.lock();
        System.out.println("Worker1 acquires the lock2...");
        lock1.unlock();
        lock2.unlock();
    }
    public void worker2()  {
        lock2.lock();
        System.out.println("Worker2 Accqurie the Lock2");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        lock1.lock();
        System.out.println("Worker2 acquires the lock1...");
        lock2.unlock();
        lock1.unlock();
    }

    public static void main(String[] args) {
        a_06_DeadLock deadLock = new a_06_DeadLock();
        new Thread(deadLock::worker1,"Worker1").start();
        new Thread(deadLock::worker2,"Worker2").start();

        //Just change the order of lock then it will be no deadlock
    }
}
