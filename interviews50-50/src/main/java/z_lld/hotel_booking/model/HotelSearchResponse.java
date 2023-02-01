package z_lld.hotel_booking.model;

import java.util.List;

public class HotelSearchResponse {
    private String hotelName;
    private List<RoomResponse> roomsList;

    public HotelSearchResponse(String hotelName, List<RoomResponse> roomsList) {
        this.hotelName = hotelName;
        this.roomsList = roomsList;
    }

    public String getHotelName() {
        return hotelName;
    }

    public HotelSearchResponse setHotelName(String hotelName) {
        this.hotelName = hotelName;
        return this;
    }

    public List<RoomResponse> getRoomsList() {
        return roomsList;
    }

    public HotelSearchResponse setRoomsList(List<RoomResponse> roomsList) {
        this.roomsList = roomsList;
        return this;
    }

    @Override
    public String toString() {
        return "HotelSearchResponse{" +
                "hotelName='" + hotelName + '\'' +
                ", roomsList=" + roomsList +
                '}';
    }
}
