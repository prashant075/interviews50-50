package z_lld.hotel_booking.dao;

import z_lld.hotel_booking.entity.RoomType;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class RoomTypeDao {
    Map<Integer, RoomType> roomTypeMap;

    public RoomTypeDao() {
        this.roomTypeMap = new HashMap<>();
    }

    public void createRoom(RoomType roomType){
        if(roomTypeMap.containsKey(roomType.getId())){
            return;
        }
        int nextRoomId = roomTypeMap.size()+1;
        roomTypeMap.put(nextRoomId, roomType);
        System.out.println("New RoomType created "+roomType);
    }
}
