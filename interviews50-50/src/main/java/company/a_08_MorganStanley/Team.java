package company.a_08_MorganStanley;

public class Team<T> {
    T value;

    public Team(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }


}
