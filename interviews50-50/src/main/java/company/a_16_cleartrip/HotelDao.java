package company.a_16_cleartrip;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HotelDao {
    static Map<String, Hotel> hoteldb =new HashMap<>();
    static Map<String, List<Room>> roomPriceListdb = new HashMap<>();
    Map<String, List<Booking>> bookingdb;

    public HotelDao() {
    }

    public void addHotel(Map<String, String> input) {
        Hotel hotel = new Hotel();
        hotel.setTitle(input.get("title"));
        hotel.setRating(input.get("rating"));
        hotel.setCity(input.get("city"));
        hoteldb.put(input.get("title"), hotel);
        System.out.println(hoteldb);
    }

    public void addInvetory(Map<String, String> input) {
        Hotel hotel = hoteldb.get(input.get("hotel"));
        List<Room> roomList = hotel.getRooms();
        // "hotel:Hotel My Place,room:room1, price:3000, rooms_available:3",
        for (Room room : roomList) {
            if (input.get("room").equals(room.getRoomName())) {
                room.setPrice(input.get("price"));
                room.setRoomcount(input.get("rooms_available"));
            }
        }
//        Room roomPrice = new Room();
//        roomPrice.setPrice(input.get("price"));
//        roomPrice.setRoomName(input.get("room"));
//        roomPrice.setRoomcount(input.get("rooms_available"));
//        roomPriceListdb.putIfAbsent(input.get("hotel"), new ArrayList<>());
//        roomPriceListdb.get(input.get("hotel")).add(roomPrice);
    }

    public void searchRoom(Map<String, String> input) {
        String city = "";
        String rating = "";
        List<String> hotelname = new ArrayList<>();
        for (Map.Entry<String, Hotel> entry : hoteldb.entrySet()) {
            Hotel hotel = entry.getValue();
            if (hotel.getCity().equals(city) && hotel.getRating().equals(rating)) {
                hotelname.add(hotel.getTitle());
            }
        }
        checkPricing(hotelname, new HashMap<>());
        //city Bangalore, price_range 2500-10500, rating 3, checkin 25-10-2022, checkout 28-10-2022
    }

    private void checkPricing(List<String> hotelname, Map<String, String> input) {
        Map<String, List<String>> resultMap = new HashMap<>();
        String[] price = input.get("price_range").split("-");
        for (String hotelInCity : hotelname) {
            List<Room> roomPrice = roomPriceListdb.get(hotelInCity);
            for (Room room : roomPrice) {
                Integer roomRate = Integer.parseInt(room.getPrice());
                if (roomRate > Integer.parseInt(price[0]) && roomRate < Integer.parseInt(price[1])) {
                    if (checkBookingNotExist(input)) {
                        System.out.println(hotelname + " " + room.getRoomName() + " " + room.getPrice());
                    }
                }
            }

        }
    }

    private boolean checkBookingNotExist(Map<String, String> input) {
        return false;
    }

    public boolean createBooking(Map<String, String> input) {
        bookingdb.putIfAbsent("hotel", new ArrayList<>());
        Booking booking = new Booking();
        booking.setRoomName(input.get("room"));
        booking.setCheckInDate(input.get("checkin"));
        booking.setCheckOutDate(input.get("checkout"));
        bookingdb.get("hotel").add(booking);
        decraseRoom();
        return true;

    }

    private boolean checkAviabality(Map<String, String> input) {
        return true;
    }

    private void decraseRoom() {
    }

    public void addRoom(String title, Map<String, String> roomMap) {
        List<Room> rooms = new ArrayList<>();
        for (Map.Entry<String, String> entry : roomMap.entrySet()) {
            Room room = new Room();
            room.setRoomName(entry.getKey());
            room.setRoomType(entry.getValue());
            rooms.add(room);
        }
        hoteldb.get(title).setRooms(rooms);
        System.out.println("Onboarded successfully.\n");
    }
}
