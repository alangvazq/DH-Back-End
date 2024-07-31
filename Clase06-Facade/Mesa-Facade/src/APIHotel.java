import java.util.ArrayList;
import java.util.List;

public class APIHotel {
    public List<Hotel> hoteles = new ArrayList<>();

    public APIHotel(){
        Hotel hotel = new Hotel("30-07-2024", "32-07-2024", "Tokio");
        Hotel hotel1 = new Hotel("26-06-2024", "25-06-2024", "Paris");

        hoteles.add(hotel);
        hoteles.add(hotel1);
    }

    public List<Hotel> getHoteles() {
        return hoteles;
    }

    public void agregarHotel(Hotel hotel) {
        this.hoteles.add(hotel);
    }
}
