package z_lld.hotel_booking.entity;

public class User {
    private  int id;
    private  String name;
    private  boolean isOwner;

    public User(int id, String name, boolean isOwner) {
        this.id = id;
        this.name = name;
        this.isOwner = isOwner;
    }

    public int getId() {
        return id;
    }

    public User setId(int id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public User setName(String name) {
        this.name = name;
        return this;
    }

    public boolean isOwner() {
        return isOwner;
    }

    public User setOwner(boolean owner) {
        isOwner = owner;
        return this;
    }
}
