package company.a_08_MorganStanley;

interface cal{
    void c(int i);
}
class  a implements cal{
    int x;

    @Override
    public void c(int i) {
    x = i*i;
    }
}
class  b implements  cal{
    int x;

    @Override
    public void c(int i) {
        x = i/i;
    }
}
public class Calculate {
    public static void main(String[] args) {
        a A1 = new a();
        b B1 = new b();
        A1.x =0;
        B1.x =0;
        A1.c(2);
        B1.c(2);
        System.out.println(A1.x +" "+B1.x);
    }
}
