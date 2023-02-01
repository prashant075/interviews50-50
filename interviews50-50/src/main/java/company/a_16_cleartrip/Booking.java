package company.a_16_cleartrip;

public class Booking {
    String roomName;
    String checkInDate;
    String checkOutDate;

    public String getRoomName() {
        return roomName;
    }

    public Booking setRoomName(String roomName) {
        this.roomName = roomName;
        return this;
    }

    public String getCheckInDate() {
        return checkInDate;
    }

    public Booking setCheckInDate(String checkInDate) {
        this.checkInDate = checkInDate;
        return this;
    }

    public String getCheckOutDate() {
        return checkOutDate;
    }

    public Booking setCheckOutDate(String checkOutDate) {
        this.checkOutDate = checkOutDate;
        return this;
    }
}
