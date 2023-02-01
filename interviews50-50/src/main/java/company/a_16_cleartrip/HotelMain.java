package company.a_16_cleartrip;

import java.io.IOException;

public class HotelMain {

    public static void main(String[] args) throws IOException {
        HotelService service = new HotelService();
         String[] input ={
                 "user:tej#command:OnboardProperty",
                 "title:Hotel My Place#city:Bangalore#rating:3#rooms:[room1:”Deluxe Room”,room2: “Luxury Room”]",
                 "user:tej#command:OnboardProperty",
                  "title:Hotel My Hotel#city:Delhi#rating:4#rooms:[room4:”Basic Room”,room6:”Suite Room”,room8:”Villa Room”]",
                 "user:tej#command:AddInventory",
                 "hotel:Hotel My Place,room:room1, price:3000, rooms_available:3",
                 "user:tej#command:AddInventory",
                "hotel:Hotel My Hotel,room:room6, price:2500, rooms_available:2"
//                 "user:raj#command:search",
//                 "city:Bangalore, price_range: 2500-10500, star_rating: 3, checkin:25-10-2022, checkout:28-10-2022",
//                 "title Hotel My Place, rooms [”Deluxe Room”-9000]",
//                 "user:raj#command:book",
//                 "title:Hotel My Place, room:room1, checkin:25-10-2022, checkout:28-10-2022"
         };
        for(int i=0;i<input.length-1;){
            String line1 =input[i];
            String line2 = input[i+1];
            service.commandAndWork(line1,line2);
            i+=2;
        }

    }
}

/*
* user:tej#command:OnboardProperty
← Enter the property details:
→ title:Hotel My Place#city:Bangalore#star rating: 3#rooms:[room1:”Deluxe Room”,room2: “Luxury Room”]
* */