package company.a_08_MorganStanley;

class myThread implements Runnable{

    @Override
    public void run() {
        Thead.obj.notify();
    }
}
public class Thead implements Runnable {
    public static Thead obj;
    private  int data;
    public Thead(){
        data = 10;
    }


    public void run() {
        obj = new Thead();
        try {
            obj.wait();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        obj.data+=20;
        System.out.println(obj.data);
    }

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new Thead());
        Thread t2 = new Thread(new myThread());
        t1.start();
        t2.start();
        System.out.println(" DRM -");
    }
}
