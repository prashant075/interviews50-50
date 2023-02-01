package company.a_08_MorganStanley;

import java.util.*;

public class Test {
    public static Iterator revser(List list){
        Collections.reverse(list);
        return list.iterator();

    }

//    public static void main(String[] args) {
//        List list = new ArrayList();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        for (Iterator it = revser(list); it.hasNext(); ) {
//            Object obj = it.next();
//            System.out.println(obj);
//        }
//    List<Employee> emp = new ArrayList<>();
//    }
//public static void main(String[] args) {
//    System.out.println(1);
//    synchronized (args){
//        System.out.println(2);
//        try{
//            args.wait();
//        }catch (InterruptedException e){}
//        System.out.println(3);
//    }
//}
//public static void main(String[] args) {
//    new Test().go();
//}
    static Test t;
    static  int count=0;

    public static void main(String[] args) throws InterruptedException {
        Test t1 = new Test();
        t1=null;
        System.gc();
        Thread.sleep(1000);
        t=null;
        System.gc();
        Thread.sleep(1000);
        System.out.println(count);
    }
    @Override
    protected void finalize(){
        System.out.println("OOO");
        count++;
        t= this;
    }
    public void go(){
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("foo");
            }
        };
        Thread t = new Thread(r);
        t.start();
        t.start();
    }
    class Employee{

    }
    class Acc extends Employee{

    }
}
