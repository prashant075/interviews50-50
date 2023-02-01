package z_lld.bookmyshow.model;

import java.util.ArrayList;
import java.util.List;

public class Screen {
    private final String id;
    private final String name;
    private final Theatre theatre;
    private final List<Seat> seats;


    public Screen(String id, String name, Theatre theatre) {
        this.id = id;
        this.name = name;
        this.theatre = theatre;
        this.seats = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Theatre getTheatre() {
        return theatre;
    }

    public List<Seat> getSeats() {
        return seats;
    }
    public void addSeat(final Seat seat){
        this.seats.add(seat);
    }
}
