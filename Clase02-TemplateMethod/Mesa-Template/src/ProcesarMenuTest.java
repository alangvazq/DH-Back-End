import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProcesarMenuTest {
    @Test
    public void casoUno(){
        // Arrange
        MenuInfantil menuInfantil = new MenuInfantil(125.0, 3);
        ProcesarMenu procesarMenu = new ProcesarMenuInfantil();
        String respuesta = "Menú infantil";

        // Act
        String proceso = procesarMenu.armarMenu(menuInfantil);

        // Assert
        assertEquals(respuesta, proceso);
    }
}