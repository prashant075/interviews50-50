package z_lld.hotel_booking.dao;

import z_lld.hotel_booking.entity.Booking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookingDao {
    private Map<Integer, Booking> bookingMap;

    public BookingDao(){
        bookingMap = new HashMap<>();
    }

    public  void createBooking(Booking booking){
        bookingMap.put(bookingMap.size()+1, booking);
    }
    public List<Booking> viewBooking(int userId){
        List<Booking>  bookings = new ArrayList<>();
        for(Map.Entry<Integer, Booking> entry:bookingMap.entrySet()){
            if(entry.getValue().getUserId()==userId){
                bookings.add(entry.getValue());
            }
        }
        return bookings;
    }

}
