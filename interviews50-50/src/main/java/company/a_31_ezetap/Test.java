package company.a_31_ezetap;

 class t {
    public static void s(){
        System.out.println("AD");
    }
}
public class Test extends t{
    public static void s(){
        System.out.println("ADs");
    }

    public static void main(String[] args) {
        t A = new Test();
        A.s();
    }
}
