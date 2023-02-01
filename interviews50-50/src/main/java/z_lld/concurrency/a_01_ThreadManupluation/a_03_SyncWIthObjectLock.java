package z_lld.concurrency.a_01_ThreadManupluation;

public class a_03_SyncWIthObjectLock {
    private static int counter1 =0;
    private static int counter2 =0;
    private static final Object lock1 = new Object();
    private static final Object lock2 = new Object();
    private static void increment1(){
        synchronized (lock1){
            for(int i=0;i<100;i++)
                counter1++;
        }
    }
    private static  void increment2(){
        synchronized (lock2){
            for(int i=0;i<100;i++)
                counter2++;
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(a_03_SyncWIthObjectLock::increment1);
        Thread t2 = new Thread(a_03_SyncWIthObjectLock::increment2);
        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
       System.out.println("c1 :"+counter1);
       System.out.println("c2 :"+counter2);
    }
}
