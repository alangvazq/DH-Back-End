import java.util.ArrayList;
import java.util.List;

public class Bosque {
    private final List<Arbol> arboles = new ArrayList<>();

    public void plantarArboles(String tipo, int alto, int horizontal, String color){
        Arbol arbol = ArbolFactory.getArbol(tipo, alto, horizontal, color);
        arboles.add(arbol);
    }
}
