package z_lld.concurrency.a_01_ThreadManupluation;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class a_05_ReentLockForProCon {
    private Lock  lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    private void producer( ) throws InterruptedException{
        lock.lock();
        System.out.println("Producer Method");
        condition.await();
        System.out.println("Again the Producer");
        lock.unlock();
    }
    private void consumer() throws InterruptedException{
        Thread.sleep(1000);
        lock.lock();
        System.out.println("Consumer Method");
        condition.signal();
        lock.unlock();
    }

    public static void main(String[] args) {
        a_05_ReentLockForProCon object = new a_05_ReentLockForProCon();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    object.producer();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    object.consumer();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        t1.start();
        t2.start();

    }
}
