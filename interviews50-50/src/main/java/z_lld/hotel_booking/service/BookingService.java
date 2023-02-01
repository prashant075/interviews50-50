package z_lld.hotel_booking.service;

import z_lld.hotel_booking.dao.BookingDao;
import z_lld.hotel_booking.entity.Booking;
import z_lld.hotel_booking.entity.Hotel;
import z_lld.hotel_booking.entity.RoomType;

import java.util.List;
import java.util.Map;

public class BookingService {
    BookingDao bookingDao;
    HotelService hotelService;


    public BookingService(HotelService hotelService){
        bookingDao = new BookingDao();
        this.hotelService =  hotelService;
    }

    public void createBooking(Booking booking){
        System.out.println("Booking Creating "+booking);
        bookingDao.createBooking(booking);
        Hotel hotel = hotelService.getHotelById(booking.getHotelId());
        for(int roomId:booking.getRoomIds()){
            List<RoomType> roomType = hotel.getRoomTypeList();
            for(RoomType roomType1:roomType){
                if(roomType1.getId()==roomId){
                    if(roomType1.getAviabaleCount()>0){
                        roomType1.setAviabaleCount(roomType1.getAviabaleCount()-1);
                        System.out.println("Room Booking in Hotel "+hotel.getName()+" With RoomNumber " + roomType1.getRoomNumber());
                    }

                }
            }
        }

        System.out.println("Hotel After Booking "+hotel);
    }
    public void viewBooking(int userId){
      System.out.println("userId "+userId+" Booking " + bookingDao.viewBooking(userId));
    }

}
