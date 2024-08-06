import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class ListaEnteros {
    private static final Logger LOGGER = Logger.getLogger(ListaEnteros.class);

    public static void calcular(List<Integer> integerList) throws Exception {
        if (integerList.isEmpty()){
            throw new Exception("Empty list");
        }

        if(integerList.size() > 5){
            LOGGER.info("La longitud de la lista es mayor a 5");
        }

        if (integerList.size() > 10) {
            LOGGER.info("La longitud de la lista es mayor a 10");
        }

        int suma = 0;
        for (int num : integerList){
            suma += num;
        }
        int promedio = suma / integerList.size();
        LOGGER.info("El promedio es: " + promedio);
    }
}
