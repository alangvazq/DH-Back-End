import java.util.ArrayList;
import java.util.List;

public class APIVuelo {
    private List<Vuelo> vuelos = new ArrayList<>();

    public APIVuelo(){
        Vuelo vuelo = new Vuelo("25-06-2024", "26-06-2024", "Paris", "Londres");
        Vuelo vuelo1 = new Vuelo("10-04-2024", "15-04-2024", "Londres", "Paris");
        vuelos.add(vuelo);
        vuelos.add(vuelo1);
    }

    public List<Vuelo> getVuelos() {
        return vuelos;
    }

    public void agregarVuelo(Vuelo vuelo){
        this.vuelos.add(vuelo);
    }
}
