package z_lld.hotel_booking.service;

import z_lld.hotel_booking.dao.HotelDao;
import z_lld.hotel_booking.entity.Hotel;
import z_lld.hotel_booking.entity.Inventory;
import z_lld.hotel_booking.entity.RoomType;
import z_lld.hotel_booking.model.HotelSearchRequest;
import z_lld.hotel_booking.model.HotelSearchResponse;
import z_lld.hotel_booking.model.RoomResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class HotelService {

    HotelDao hotelDao;
    public HotelService(){
        this.hotelDao =new HotelDao();
    }
    public void createHotel(Hotel hotel){
        hotelDao.createHotel(hotel);
    }
    public void addInventoryToHotel(Inventory inventory){
        hotelDao.addInventoryToHotel(inventory);
    }
    public void getAviableHotel(HotelSearchRequest hotelSearchRequest){
       List<Hotel> getHotel = hotelDao.getAllHotel().stream()
               .filter(hotel -> hotel.getCity().equals(hotelSearchRequest.getCity()))
               .collect(Collectors.toList());
       HotelSearchResponse hotelSearchResponse = null;
       for(Hotel _hotel:getHotel){
           List<RoomResponse> responses = new ArrayList<>();
           for(RoomType _rooms:_hotel.getRoomTypeList()){
               if(_rooms.getNightlyPrice()<=hotelSearchRequest.getMaxPrice() && _rooms.getNightlyPrice()>=hotelSearchRequest.getMinPrice()){
                  responses.add(new RoomResponse(_rooms.getRoomType(),_rooms.getNightlyPrice()));
               }
           }
           hotelSearchResponse = new HotelSearchResponse(_hotel.getName(),responses);
           System.out.println("Hotel Found "+hotelSearchResponse);
       }
    }

    public Hotel getHotelById(int hotelId) {
        return hotelDao.getHotelById(hotelId);
    }
}
