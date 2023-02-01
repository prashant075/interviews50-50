package company.a_16_cleartrip;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class HotelService {
    HotelDao hotelDao;

    HotelService(){
        this.hotelDao = new HotelDao();
    }
    public void commandAndWork(String commoand, String inputString) throws IOException {
        String[] input = commoand.split("#");
        String[] val = input[1].split(":");
        HotelService service = new HotelService();
        switch (val[1]){
            case "OnboardProperty":
                service.hotelOnBoard(inputString);
                break;
            case "AddInventory":
                service.addInvertory(inputString);
                break;
            case "search":
                service.searchRoom(inputString);
                break;
            case "book":
                service.createBooking(inputString);
                break;
            default:
                break;
        }
    }

    //"title:Hotel My Place, room:room1, checkin:25-10-2022, checkout:28-10-2022"
    public void createBooking(String input) {
        Map<String, String> map = new HashMap<>();
        String[] bookStr = input.split(",");
        for(String pair:bookStr){
            String[] keyValue = pair.split(":");
            map.put(keyValue[0],keyValue[1]);
        }
        if( checkIfBookingConfirmable(map)){
            hotelDao.createBooking(map);
        }

    }

    public boolean checkIfBookingConfirmable(Map<String, String> bookingMap) {
        return true;
    }

    // "city:Bangalore, price_range: 2500-10500, star_rating: 3, checkin:25-10-2022, checkout:28-10-2022",
    private  void searchRoom(String input) {
        Map<String, String> map = new HashMap<>();
        String[] bookStr = input.split(",");
        for(String pair:bookStr){
            String[] keyValue = pair.split(":");
            map.put(keyValue[0],keyValue[1]);
        }
        hotelDao.searchRoom(map);

    }

    //"hotel:Hotel My Place,room:room1, price:3000, rooms_available:3",
    private  void addInvertory(String input) throws IOException {
        Map<String, String> map = new HashMap<>();
        String[] bookStr = input.split(",");
        for(String pair:bookStr){
            String[] keyValue = pair.split(":");
            map.put(keyValue[0],keyValue[1]);
        }
       // hotelDao.searchRoom(map);
        hotelDao.addInvetory(map);

    }

    //"title:Hotel My Place#city:Bangalore#rating:3#rooms:[room1:”Deluxe Room”,room2: “Luxury Room”]",
    private  void hotelOnBoard(String input) {
        Map<String,String> map = new HashMap<>();
        Map<String, String> roomMap = new HashMap<>();
        String title="";
        System.out.println("Enter the property details:");
        String[] hotelData = input.split("#");
        for(String line:hotelData){
            if(line.startsWith("rooms")){
                roomMap= convertStringToMap(line);
            }else{
                String[] pair = line.split(":");
                    if(pair[0].equals("title")){
                        title=pair[1];
                    }
                    map.put(pair[0],pair[1]);
            }


        }
        hotelDao.addHotel(map);
        hotelDao.addRoom(title, roomMap);
    }

    private  Map<String, String> convertStringToMap(String s) {
        String value = s.substring(7, s.length()-1);
        String[] keyValue = value.split(",");
        Map<String, String> map = new HashMap<>();
        for(String pair:keyValue){
            String[] val =pair.split(":");
            map.put(val[0], val[1]);
        }
        return map;
    }
}
