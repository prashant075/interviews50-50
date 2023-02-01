package z_lld.hotel_booking.dao;

import z_lld.hotel_booking.entity.Hotel;
import z_lld.hotel_booking.entity.Inventory;
import z_lld.hotel_booking.entity.RoomType;

import java.util.*;

public class HotelDao {
    private Map<Integer, Hotel> hotelMap;

    public HotelDao(){
        this.hotelMap = new HashMap<>();
    }

    public void createHotel(Hotel hotel){
       if(hotelMap.containsKey(hotel.getId())){
           return;
        }
       int nextHotelId = hotelMap.size()+1;
       hotelMap.put(nextHotelId,hotel);
       System.out.println("On Boarded Hotel"+hotel);
    }
    public void addInventoryToHotel(Inventory inventory){
        Hotel hotel =null;
        for(Map.Entry<Integer, Hotel> entry: hotelMap.entrySet()){
            if(entry.getValue().getName().equals(inventory.getHotelName())){
                hotel = entry.getValue();
                break;
            }
        }
        //assert hotel != null;
        for(RoomType roomType : hotel.getRoomTypeList()){
         if(roomType.getRoomNumber().equals(inventory.getRoomNumber())){
             roomType.setAviabaleCount(inventory.getAviableCount());
             roomType.setNightlyPrice(inventory.getPrice());
             System.out.println("Inventory OnBoard for Hotel "+inventory);
             return;
         }
       }
    }

    public List<Hotel> getAllHotel() {
        List<Hotel> hotelList = new ArrayList<>(hotelMap.values());
        return hotelList;
    }

    public Hotel getHotelById(int hotelId) {
        for(Map.Entry<Integer, Hotel> entry:hotelMap.entrySet()){
            if(entry.getKey()==hotelId) return entry.getValue();
        }
        return null;
    }
}
