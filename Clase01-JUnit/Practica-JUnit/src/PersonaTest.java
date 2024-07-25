import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.*;

class PersonaTest {

    @Test
    public void casoUno() {
        //arrange -> dado lo que necesito para hacer la prueba
        Persona alan = new Persona("Alan", "García", "a@gmail.com", "20/01/2015");

        //act -> ocurre el proceso, la acción
        String nombreCompleto = alan.obtenerNombreCompleto();

        //assert -> comparo con lo que espero
        assertEquals(nombreCompleto, "García, Alan");
    }

    @Test
    public void casoDos(){
        //arrange
        LocalDate fechaPrueba = LocalDate.parse("21/09/2021", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        Persona alan = new Persona("Alan", "García", "a@gmail.com", "20/1/2000");

        //act
        boolean esMayorDeEdad = alan.esMayorDeEdad(fechaPrueba);

        //assert
        assertTrue(esMayorDeEdad);
    }
}