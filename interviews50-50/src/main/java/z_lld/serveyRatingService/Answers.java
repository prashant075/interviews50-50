package z_lld.serveyRatingService;

public class Answers extends BaseEntity{

    private  int weight;
    public Answers(int id, String name, int weight){
        this.id = id;
        this.weight = weight;
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public Answers setWeight(int weight) {
        this.weight = weight;
        return this;
    }

    @Override
    public String toString() {
        return "Answers{" +
                "weight=" + weight +
                ", id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
