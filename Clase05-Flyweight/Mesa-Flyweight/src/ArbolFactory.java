import java.util.HashMap;
import java.util.Map;

public class ArbolFactory {
    private static final Map<String, Arbol> arbolMap = new HashMap<>();

    public static Arbol getArbol(String tipo, Integer alto, Integer horizontal, String modelo){
        String clave = tipo + " " + alto + " " + horizontal + " " + modelo;

        System.out.println(clave);

        if (!arbolMap.containsKey(clave)){
            arbolMap.put(clave, new Arbol(tipo, alto, horizontal, modelo));
            System.out.println("Se creo árbol");
        }
        return arbolMap.get(clave);
    }
}
