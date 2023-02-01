package company.a_08_MorganStanley;

public abstract class Test1 {
    public String recipient;
    public abstract void sendMessage();
    public static void  main(String[] args){
        Test1 m = new Child();
       // Set<? extends IOException> set = new TreeSet<RuntimeException>();
    }
    static class Child extends Test1{
        public final void sendMessage(){
            System.out.println(recipient);
        }
    }
}
