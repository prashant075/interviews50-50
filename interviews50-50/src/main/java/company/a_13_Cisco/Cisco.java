package company.a_13_Cisco;

/**
 *
 * Lonenly Prime Number
 * Valid parantheies
 */

//public class Cisco {
//    Cisco(){
//        System.out.println(1);
//    }
//    public void test(){
//        System.out.println(2);
//    }
//    {
//        System.out.println(3);
//    }
//    public void PrintTest(){
//        System.out.println(4);
//    }
//    static {
//        System.out.println(5);
//    }
//
//    public static void main(String[] args) {
//        Cisco cisco = new Cisco();
//        cisco.PrintTest();
//        cisco.test();
//    }
//}
class MyThread extends  Thread{
    MyThread(){
        System.out.println("My");
    }
    @Override
    public void run(){
        System.out.println("run");
    }
    public void run(String s){
        System.out.println("para");
    }
}
public class Cisco{
    public static void main(String[] args) {
        Thread t = new MyThread(){
            public void run(){
                System.out.println("H");
            }
        };
        t.start();
    }
}
