package z_lld.hotel_booking.model;

import java.util.Date;

public class HotelSearchRequest {
    private String city;
    private Double minPrice;
    private Double maxPrice;
    private Double rating;
    private Date checkInDate;
    private Date checkOutDate;

    public HotelSearchRequest(String city, Double minPrice, Double maxPrice, Double rating, Date checkInDate, Date checkOutDate) {
        this.city = city;
        this.minPrice = minPrice;
        this.maxPrice = maxPrice;
        this.rating = rating;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
    }

    public String getCity() {
        return city;
    }

    public HotelSearchRequest setCity(String city) {
        this.city = city;
        return this;
    }

    public Double getMinPrice() {
        return minPrice;
    }

    public HotelSearchRequest setMinPrice(Double minPrice) {
        this.minPrice = minPrice;
        return this;
    }

    public Double getMaxPrice() {
        return maxPrice;
    }

    public HotelSearchRequest setMaxPrice(Double maxPrice) {
        this.maxPrice = maxPrice;
        return this;
    }

    public Double getRating() {
        return rating;
    }

    public HotelSearchRequest setRating(Double rating) {
        this.rating = rating;
        return this;
    }

    public Date getCheckInDate() {
        return checkInDate;
    }

    public HotelSearchRequest setCheckInDate(Date checkInDate) {
        this.checkInDate = checkInDate;
        return this;
    }

    public Date getCheckOutDate() {
        return checkOutDate;
    }

    public HotelSearchRequest setCheckOutDate(Date checkOutDate) {
        this.checkOutDate = checkOutDate;
        return this;
    }

    @Override
    public String toString() {
        return "HotelSearchRequest{" +
                "city='" + city + '\'' +
                ", minPrice=" + minPrice +
                ", maxPrice=" + maxPrice +
                ", rating=" + rating +
                ", checkInDate=" + checkInDate +
                ", checkOutDate=" + checkOutDate +
                '}';
    }
}
