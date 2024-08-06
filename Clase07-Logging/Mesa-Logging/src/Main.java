import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class Main {
    private static final Logger LOGGER = Logger.getLogger(Main.class);
    public static void main(String[] args) {

        List<Integer> listaVacia = new ArrayList<>();
        List<Integer> lista10 = List.of(1,2,3,4,5,6,7,8,9,10,11);

        try{
            ListaEnteros.calcular(lista10);
            ListaEnteros.calcular(listaVacia);
        } catch (Exception e) {
            LOGGER.error("La lista es igual a cero", e);
            throw new RuntimeException(e);
        }
    }
}
