package company.a_16_cleartrip;

public class Room {
    String roomName;
    String price;
    String roomType;
    String roomcount;

    public String getRoomType() {
        return roomType;
    }

    public Room setRoomType(String roomType) {
        this.roomType = roomType;
        return this;
    }

    public String getRoomcount() {
        return roomcount;
    }

    public Room setRoomcount(String roomcount) {
        this.roomcount = roomcount;
        return this;
    }

    public String getRoomName() {
        return roomName;
    }

    public Room setRoomName(String roomName) {
        this.roomName = roomName;
        return this;
    }

    public String getPrice() {
        return price;
    }

    public Room setPrice(String price) {
        this.price = price;
        return this;
    }
}
