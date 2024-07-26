import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnalistaDeCalidadTest {
    @Test
    public void casoUno(){
        // Arrange
        Articulo articulo = new Articulo("Leche", 1500, 1200, "Sano");
        AnalistaDeCalidad analistaDeCalidad = new AnalistaDeCalidad();
        String respuesta = "Control de calidad aceptado";

        // Act
        String proceso = analistaDeCalidad.checkControl(articulo);

        // Assert
        assertEquals(respuesta, proceso);

    }
}