import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AreaDeFiguraTest {
    @Test
    public void casoUno(){
        // Arrange
        AreaDeFigura cuadrado = new AreaDeFigura("cuadrado");
        AreaDeFigura circulo = new AreaDeFigura("círculo");

        // Act
        String areaCuadrado = cuadrado.calcularArea(15.5);
        String areaCirculo = circulo.calcularArea(24.0);

        // Assert
        assertEquals("El área del cuadrado es 240.25 unidades", areaCuadrado);
        assertEquals("El área del círculo es 1809.56 unidades", areaCirculo);
    }

    @Test
    public void casoDos(){
        // Arrange
        AreaDeFigura cuadrado = new AreaDeFigura("cuadrado");

        // Act
        String parametroCero = cuadrado.calcularArea(0);

        // Assert
        assertEquals("El valor del radio o lado debe ser mayor que cero.", parametroCero);
    }
}