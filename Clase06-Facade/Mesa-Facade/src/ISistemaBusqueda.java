import java.util.List;

public interface ISistemaBusqueda {
    List<Vuelo> buscarVuelos(String fechaSalida, String fechaRegreso, String origen, String destino);

    List<Hotel> buscarHotel(String fechaEntrada, String fechaSalida, String ciudad);
}
