package z_lld.serveyRatingService;

public class BaseEntity {
    int id;
    String name;

    public int getId() {
        return id;
    }

    public BaseEntity setId(int id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public BaseEntity setName(String name) {
        this.name = name;
        return this;
    }
}
