package z_lld.hotel_booking.entity;

public class Inventory {
    private String hotelName;
    private String roomNumber;
    private Double price;
    private int aviableCount;

    public Inventory(String hotelName, String roomNumber, Double price, int aviableCount) {
        this.hotelName = hotelName;
        this.roomNumber = roomNumber;
        this.price = price;
        this.aviableCount = aviableCount;
    }

    public String getHotelName() {
        return hotelName;
    }

    public Inventory setHotelName(String hotelName) {
        this.hotelName = hotelName;
        return this;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public Inventory setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
        return this;
    }

    public Double getPrice() {
        return price;
    }

    public Inventory setPrice(Double price) {
        this.price = price;
        return this;
    }

    public int getAviableCount() {
        return aviableCount;
    }

    public Inventory setAviableCount(int aviableCount) {
        this.aviableCount = aviableCount;
        return this;
    }

    @Override
    public String toString() {
        return "Inventory{" +
                "hotelName='" + hotelName + '\'' +
                ", roomNumber='" + roomNumber + '\'' +
                ", price='" + price + '\'' +
                ", aviableCount='" + aviableCount + '\'' +
                '}';
    }
}
