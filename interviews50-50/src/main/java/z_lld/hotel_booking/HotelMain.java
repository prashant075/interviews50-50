package z_lld.hotel_booking;

import z_lld.hotel_booking.entity.Booking;
import z_lld.hotel_booking.entity.Hotel;
import z_lld.hotel_booking.entity.Inventory;
import z_lld.hotel_booking.entity.RoomType;
import z_lld.hotel_booking.model.HotelSearchRequest;
import z_lld.hotel_booking.service.BookingService;
import z_lld.hotel_booking.service.HotelService;
import z_lld.hotel_booking.service.RoomTypeService;

import java.util.Arrays;
import java.util.Date;

public class HotelMain {
    public static void main(String[] args) {
        RoomType roomType1 = new RoomType(1,"room1","Delux");
        RoomType roomType2 = new RoomType(2,"room2","Luxery");
        RoomType roomType3 = new RoomType(3,"room3","Basic");
        RoomType roomType4 = new RoomType(4,"room4","Suite");
        RoomType roomType5 = new RoomType(5,"room5","Villa");
        RoomTypeService roomTypeService = new RoomTypeService();
        roomTypeService.createRoom(roomType1);
        roomTypeService.createRoom(roomType2);
        roomTypeService.createRoom(roomType3);
        roomTypeService.createRoom(roomType4);
        roomTypeService.createRoom(roomType5);
        HotelService hotelService = new HotelService();
        Hotel hotel1 = new Hotel(1, "Hotel My Place","Bangalore",3.0, Arrays.asList(roomType1,roomType2));
        Hotel hotel2 = new Hotel(2, "Hotel My India","Bangalore",4.0, Arrays.asList(roomType3,roomType4,roomType5));
        hotelService.createHotel(hotel1);
        hotelService.createHotel(hotel2);
        Inventory inventory1 = new Inventory("Hotel My Place","room1",2600.0, 1);
        Inventory inventory2 = new Inventory("Hotel My Place","room2",2000.0, 1);
        Inventory inventory3 = new Inventory("Hotel My India","room3",2800.0, 2);
        Inventory inventory4 = new Inventory("Hotel My India","room4",2500.0, 2);
        Inventory inventory5 = new Inventory("Hotel My India","room5",5500.0, 2);
        hotelService.addInventoryToHotel(inventory1);
        hotelService.addInventoryToHotel(inventory2);
        hotelService.addInventoryToHotel(inventory3);
        hotelService.addInventoryToHotel(inventory4);
        hotelService.addInventoryToHotel(inventory5);
        HotelSearchRequest hotelSearchRequest = new HotelSearchRequest("Bangalore", 2500.0, 2800.0,3.0,new Date(), new Date());
        System.out.println("Hotel Search Request "+hotelSearchRequest);
        hotelService.getAviableHotel(hotelSearchRequest);
        Booking booking = new Booking(1, 1,Arrays.asList(1,2),1,new Date(), new Date(),3000);
        BookingService bookingService = new BookingService( hotelService);
        bookingService.createBooking(booking);
        bookingService.viewBooking(1);

    }
}
