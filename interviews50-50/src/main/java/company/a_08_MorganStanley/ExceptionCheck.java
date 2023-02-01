package company.a_08_MorganStanley;

public class ExceptionCheck {
    public void divide(int a, int b){
        try {
            int c = a/b;
        }finally {
            System.out.println("Finally");
        }
    }
    private static Object method(){
        try{
            int i =10/0;return i;
        }catch (ArithmeticException e){
            return "catch";
        }finally {
            return "finally";
        }
    }
    public static void main(String[] args) {
        ExceptionCheck exceptionCheck = new ExceptionCheck();
        try{
            exceptionCheck.divide(3,0);
        }catch (RuntimeException re){
            System.out.println("RUn");
        }catch (Exception e){
            System.out.println("e");
        }finally {
            System.out.println("Emd");
        }
        System.out.println(method());
        Team<String> f = new Team<>("a String");
        Team<String> t = new Team<>("123");
        System.out.println(f.getValue());
        System.out.println(t.getValue());
    }

}
