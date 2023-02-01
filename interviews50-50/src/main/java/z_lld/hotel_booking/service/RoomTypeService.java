package z_lld.hotel_booking.service;

import z_lld.hotel_booking.dao.RoomTypeDao;
import z_lld.hotel_booking.entity.RoomType;

public class RoomTypeService {

    RoomTypeDao roomTypeDao;
    public RoomTypeService(){
        this.roomTypeDao = new RoomTypeDao();
    }
    public void createRoom(RoomType roomType){
        roomTypeDao.createRoom(roomType);
    }
}
