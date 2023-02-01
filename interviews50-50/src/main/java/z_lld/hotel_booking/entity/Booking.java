package z_lld.hotel_booking.entity;

import java.util.Date;
import java.util.List;

public class Booking {
    private int id;
    private int userId;
    private List<Integer> roomIds;
    private int hotelId;
    private Date checkinDate;
    private Date checkoutDate;
    private int amount;

    public Booking(int id, int userId, List<Integer> roomIds, int hotelId, Date checkinDate, Date checkoutDate, int amount) {
        this.id = id;
        this.userId = userId;
        this.roomIds = roomIds;
        this.hotelId = hotelId;
        this.checkinDate = checkinDate;
        this.checkoutDate = checkoutDate;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public Booking setId(int id) {
        this.id = id;
        return this;
    }

    public int getUserId() {
        return userId;
    }

    public Booking setUserId(int userId) {
        this.userId = userId;
        return this;
    }

    public List<Integer> getRoomIds() {
        return roomIds;
    }

    public Booking setRoomIds(List<Integer> roomIds) {
        this.roomIds = roomIds;
        return this;
    }

    public int getHotelId() {
        return hotelId;
    }

    public Booking setHotelId(int hotelId) {
        this.hotelId = hotelId;
        return this;
    }

    public Date getCheckinDate() {
        return checkinDate;
    }

    public Booking setCheckinDate(Date checkinDate) {
        this.checkinDate = checkinDate;
        return this;
    }

    public Date getCheckoutDate() {
        return checkoutDate;
    }

    public Booking setCheckoutDate(Date checkoutDate) {
        this.checkoutDate = checkoutDate;
        return this;
    }

    public int getAmount() {
        return amount;
    }

    public Booking setAmount(int amount) {
        this.amount = amount;
        return this;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "id=" + id +
                ", userId=" + userId +
                ", roomIds=" + roomIds +
                ", hotelId=" + hotelId +
                ", checkinDate=" + checkinDate +
                ", checkoutDate=" + checkoutDate +
                ", amount=" + amount +
                '}';
    }
}
