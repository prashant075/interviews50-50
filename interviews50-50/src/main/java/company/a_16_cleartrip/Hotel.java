package company.a_16_cleartrip;

import java.util.List;

public class Hotel {
   String title;
   String city;
   String rating;
   List<Room> rooms;

    public String getCity() {
        return city;
    }

    public String getRating() {
        return rating;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public Hotel setTitle(String title) {
        this.title = title;
        return this;
    }

    public Hotel setCity(String city) {
        this.city = city;
        return this;
    }

    public Hotel setRating(String rating) {
        this.rating = rating;
        return this;
    }

    public Hotel setRooms(List<Room> roomTypes) {
        this.rooms = roomTypes;
        return this;
    }

    public String getTitle() {
        return title;
    }
}
