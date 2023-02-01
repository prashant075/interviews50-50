package z_lld.concurrency.a_01_ThreadManupluation;

import java.util.ArrayList;
import java.util.List;

public class a_04_prodConsUsingWait {
    private static final List<Integer> list = new ArrayList<>();
    private static final int UPPER_LIMIT =5;
    private static final int LOWER_LIMIT =0;
    private static final Object lock = new Object();
    private static int value;
    private static void producer() throws InterruptedException {
        synchronized (lock) {
            while (1>0) {
                if (list.size() == UPPER_LIMIT) {
                    System.out.println("waiting for Removal");
                    lock.wait();
                } else {
                    System.out.println("Adding :"+value);
                    list.add(value);
                    value++;
                    lock.notify();
                }
                Thread.sleep(500);
            }
        }
    }
    private static void consumer() throws InterruptedException {
        synchronized (lock) {
            while (1>0) {
                if (list.size() == LOWER_LIMIT) {
                    System.out.println("waiting for Adding");
                    value=0;
                    lock.wait();
                } else {
                    System.out.println("Removing :"+list.remove(list.size()-1));
                    lock.notify();
                }
                Thread.sleep(500);
            }
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            try {
                producer();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Thread t2 = new Thread(() -> {
            try {
                consumer();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        t1.start();
        t2.start();

    }
}
