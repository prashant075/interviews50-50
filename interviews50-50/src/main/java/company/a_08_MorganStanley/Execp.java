package company.a_08_MorganStanley;

class JavaTest2{
    public void div(int a, int b){
        try{
            int c= a/b;
        }finally {
            System.out.println("FIna");
        }
    }
}
public class Execp {
    public static void main(String[] args) {
        JavaTest2 a   = new JavaTest2();
        try{
            a.div(3,0);
        }catch (RuntimeException e){
            System.out.println("OK");
        }catch (Exception e){
            System.out.println("ASAS");
        }finally {
            System.out.println("S");
        }
    }
}
