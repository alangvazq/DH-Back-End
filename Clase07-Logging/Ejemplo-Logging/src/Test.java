import java.util.logging.Logger;

public class Test {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora(1, 3);
        double suma = calculadora.suma();
        System.out.println(suma);

        Calculadora calculadora1 = new Calculadora(1, 0);
        double dividir = calculadora1.division();
        System.out.println(dividir);

        Calculadora calculadora2 = new Calculadora(8, 4);
        double dividir1 = calculadora2.division();
        System.out.println(dividir1);
    }
}
