import java.util.ArrayList;
import java.util.List;

public class SistemaBusqueda implements ISistemaBusqueda{
    private APIVuelo apiVuelo;
    private APIHotel apiHotel;

    public SistemaBusqueda(){
        this.apiHotel = new APIHotel();
        this.apiVuelo = new APIVuelo();
    }

    @Override
    public List<Vuelo> buscarVuelos(String fechaSalida, String fechaRegreso, String origen, String destino) {
        List<Vuelo> vuelos = new ArrayList<>();
        for (Vuelo vuelo : apiVuelo.getVuelos()){
            if(vuelo.getFechaSalida().equals(fechaSalida) &&
            vuelo.getFechaRegreso().equals(fechaRegreso) &&
            vuelo.getOrigen().equals(origen) &&
            vuelo.getDestino().equals(destino)){
                vuelos.add(vuelo);
            }
        }
        return vuelos;
    }

    @Override
    public List<Hotel> buscarHotel(String fechaEntrada, String fechaSalida, String ciudad) {
        List<Hotel> hoteles = new ArrayList<>();
        for (Hotel hotel : apiHotel.getHoteles()) {
            if (hotel.getFechaEntrada().equals(fechaEntrada) &&
                    hotel.getFechaSalida().equals(fechaSalida) &&
                    hotel.getCiudad().equals(ciudad)) {
                hoteles.add(hotel);
            }
        }
        return hoteles;
    }
}
