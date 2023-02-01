package z_lld.hotel_booking.entity;

public class RoomType {
    private int id;
    private String roomNumber;
    private String roomType;
    private Double nightlyPrice;
    private int aviabaleCount;

    public RoomType(int id, String roomNumber, String roomType) {
        this.id = id;
        this.roomNumber = roomNumber;
        this.roomType = roomType;
    }

    public int getId() {
        return id;
    }

    public RoomType setId(int id) {
        this.id = id;
        return this;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public RoomType setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
        return this;
    }

    public String getRoomType() {
        return roomType;
    }

    public RoomType setRoomType(String roomType) {
        this.roomType = roomType;
        return this;
    }

    public Double getNightlyPrice() {
        return nightlyPrice;
    }

    public RoomType setNightlyPrice(Double nightlyPrice) {
        this.nightlyPrice = nightlyPrice;
        return this;
    }

    public int getAviabaleCount() {
        return aviabaleCount;
    }

    public RoomType setAviabaleCount(int aviabaleCount) {
        this.aviabaleCount = aviabaleCount;
        return this;
    }

    @Override
    public String toString() {
        return "RoomType{" +
                "id=" + id +
                ", roomNumber='" + roomNumber + '\'' +
                ", roomType='" + roomType + '\'' +
                ", nightlyPrice=" + nightlyPrice +
                ", aviabaleCount=" + aviabaleCount +
                '}';
    }
}
