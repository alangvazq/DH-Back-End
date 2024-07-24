import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LiquidadorTest {

    /*
    CASO 1: Debería emitir un documento en papel cuando es un empleado efectivo.
    ● Dado: Un empleado efectivo, Martín Martini, con un sueldo básico de 400, un
    valor fijo de descuentos de 40 y un total de 60 en premios.
    ● Cuando: Intento calcular la liquidación.
    ● Entonces: Obtengo el mensaje “La liquidación generada es un documento
    impreso. Saldo a liquidar: 420”
     */
    @Test
    public void CasoUno() {
        //arrange
        Empleado empleado = new EmpleadoEfectivo("Martín",
                "Martini",
                "123",
                400d,
                40d,
                60d);

        Liquidador liquidador = new LiquidadorEfectivo();

        String respuestaEsperada = "La liquidación generada es un documento" +
                " impreso. Saldo a liquidar: 420.0";

        //act
        String calcular = liquidador.liquidarSueldo(empleado);

        //assert
        assertEquals(respuestaEsperada, calcular);
    }

    @Test
    public void CasoDos() {
        //arrange
        Empleado empleado = new EmpleadoContratado("Pompilia",
                "Pompini",
                "1234",
                7d,
                120);

        Liquidador liquidador = new LiquidadorContratado();

        String respuestaEsperada = "La liquidación generada es un documento" +
                " digital. Saldo a liquidar: 840.0";

        //act
        String calcular = liquidador.liquidarSueldo(empleado);

        //assert
        assertEquals(respuestaEsperada, calcular);
    }

    @Test
    public void CasoTres() {
        //arrange
        Empleado empleado = new EmpleadoContratado("Pompilia",
                "Pompini",
                "1234",
                7d,
                120);

        Liquidador liquidador = new LiquidadorEfectivo();

        String respuestaEsperada = "La liquidación no pudo ser calculada";

        //act
        String calcular = liquidador.liquidarSueldo(empleado);

        //assert
        assertEquals(respuestaEsperada, calcular);
    }
}