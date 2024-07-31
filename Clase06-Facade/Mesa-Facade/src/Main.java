import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ISistemaBusqueda sistemaBusqueda = new SistemaBusqueda();

        String ciudad = "Londres";
        String fechaDesde = "25-06-2024";
        String fechaHasta = "26-06-2024";
        String origen = "Paris";

        List<Vuelo> vuelos = sistemaBusqueda.buscarVuelos(fechaDesde, fechaHasta, origen, ciudad);
        List<Hotel> hoteles = sistemaBusqueda.buscarHotel(fechaDesde, fechaHasta, ciudad);

        System.out.println("Vuelos disponibles:");
        for (Vuelo vuelo : vuelos) {
            System.out.println(vuelo);
        }

        System.out.println("Hoteles disponibles:");
        for (Hotel hotel : hoteles) {
            System.out.println(hotel);
        }
    }
}
