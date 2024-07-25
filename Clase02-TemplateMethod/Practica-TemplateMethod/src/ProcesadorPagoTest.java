import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class ProcesadorPagoTest {
    @Test
    public void casoUno() {
        // Arrange
        Tarjeta debito = new TarjetaDebito("123456", "123", "10-05-2024", 5000);
        ProcesadorPago procesarPago = new ProcesadorDebito();
        String repuesta = "Tarjeta expirada";
        LocalDate fecha = LocalDate.of(2024, 7, 25);
        
        // Act
        String procesarPagoDebito = procesarPago.procesarPago(debito, 5, fecha);

        // Assert
        assertEquals(procesarPagoDebito, repuesta);
    }
}