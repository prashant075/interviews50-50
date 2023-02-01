package z_lld.hotel_booking.entity;

import java.util.List;

public class Hotel {
    private int id;
    private String name;
    private String city;
    private double rating;
    private List<RoomType> roomTypeList;

    public Hotel(int id, String name, String city, double rating, List<RoomType> roomTypeList) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.rating = rating;
        this.roomTypeList = roomTypeList;
    }

    public int getId() {
        return id;
    }

    public Hotel setId(int id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Hotel setName(String name) {
        this.name = name;
        return this;
    }

    public String getCity() {
        return city;
    }

    public Hotel setCity(String city) {
        this.city = city;
        return this;
    }

    public double getRating() {
        return rating;
    }

    public Hotel setRating(double rating) {
        this.rating = rating;
        return this;
    }

    public List<RoomType> getRoomTypeList() {
        return roomTypeList;
    }

    public Hotel setRoomTypeList(List<RoomType> roomTypeList) {
        this.roomTypeList = roomTypeList;
        return this;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", rating=" + rating +
                ", roomTypeList=" + roomTypeList +
                '}';
    }
}
