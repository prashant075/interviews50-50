package company.a_08_MorganStanley;

public class Gen<T> {
    T value;
    public Gen(T value){
        this.value = value;
    }
    public T getValue(){
        return  value;
    }

    public static void main(String[] args) {
        Gen<String> f = new Gen<>("AS");
        Gen<Integer> in = new Gen<>(12);
        System.out.println(f.getValue());
        System.out.println(in.getValue());
    }
}
