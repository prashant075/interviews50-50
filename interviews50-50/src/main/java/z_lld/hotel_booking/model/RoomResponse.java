package z_lld.hotel_booking.model;

public class RoomResponse {
    private String roomName;
    private Double price;

    public RoomResponse(String roomName, Double price) {
        this.roomName = roomName;
        this.price = price;
    }

    @Override
    public String toString() {
        return "RoomResponse{" +
                "roomName='" + roomName + '\'' +
                ", price=" + price +
                '}';
    }

    public String getRoomName() {
        return roomName;
    }

    public RoomResponse setRoomName(String roomName) {
        this.roomName = roomName;
        return this;
    }

    public Double getPrice() {
        return price;
    }

    public RoomResponse setPrice(Double price) {
        this.price = price;
        return this;
    }
}
