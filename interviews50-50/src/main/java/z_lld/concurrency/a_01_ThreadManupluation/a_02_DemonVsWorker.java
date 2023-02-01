package z_lld.concurrency.a_01_ThreadManupluation;

class DemonWorker implements Runnable{

    @Override
    public void run() {
    while(1>0){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Demon Working");
        }
    }
}
class NormalWorker implements Runnable{

    @Override
    public void run() {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Normal Working");
        }
}
public class a_02_DemonVsWorker {
    public static void main(String[] args) {
        Thread t1 = new Thread(new DemonWorker());
        Thread t2 = new Thread(new NormalWorker());
        t1.setDaemon(true);
        t1.start();
        t2.start();
        System.out.println("Wait");

    }
}
