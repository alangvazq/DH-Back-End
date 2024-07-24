import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GrupoTest {
    /* Dadas 5 personas (Juan, Pedro, Ana, Luz y Julián) y una colección vacía de
    objetos tipo Persona, cuando se intentan agregar estas a la colección, el
    tamaño de la colección debería ser 2 */

    @Test
    public void casoUno() {
        //arrange -> dado lo que necesito para hacer la prueba
        Persona juan = new Persona("Juan", 20);
        Persona pedro = new Persona("Pedro", 20);
        Persona ana = new Persona("Ana", 20);
        Persona luz = new Persona("Luz", 20);
        Persona julian = new Persona("Julián", 20);

        Grupo grupo1 = new Grupo();

        //act -> ocurre el proceso, la acción
        grupo1.agregarPersona(juan);
        grupo1.agregarPersona(pedro);
        grupo1.agregarPersona(ana);
        grupo1.agregarPersona(luz);
        grupo1.agregarPersona(julian);

        //assert -> comparo con lo que espero
        assertTrue(grupo1.getPersonas().size() == 2);
    }

    @Test
    public void casoDos() {
        //arrange -> dado lo que necesito para hacer la prueba
        Persona juanelo = new Persona("Juanelo", 18);
        Persona pedro = new Persona("Pedro", 17);
        Persona alberto = new Persona("Alberto", 22);
        Persona lucia = new Persona("Lucía", 14);
        Persona julian = new Persona("Julian", 32);

        Grupo grupo2 = new Grupo();

        //act -> ocurre el proceso, la acción
        grupo2.agregarPersona(juanelo);
        grupo2.agregarPersona(pedro);
        grupo2.agregarPersona(alberto);
        grupo2.agregarPersona(lucia);
        grupo2.agregarPersona(julian);

        //assert -> comparo con lo que espero
        assertTrue(grupo2.getPersonas().size() == 3);
    }

    @Test
    public void casoTres() {
        //arrange -> dado lo que necesito para hacer la prueba
        Persona nicolas = new Persona("N1c0las", 20);
        Persona tomas = new Persona("Tomas", 20);
        Persona esteban = new Persona("3steban", 20);
        Persona carlos = new Persona(" Carlos\\sV", 20);
        Persona francisco = new Persona("Francisco\\sII", 20);

        Grupo grupo3 = new Grupo();

        //act -> ocurre el proceso, la acción
        grupo3.agregarPersona(nicolas);
        grupo3.agregarPersona(tomas);
        grupo3.agregarPersona(esteban);
        grupo3.agregarPersona(carlos);
        grupo3.agregarPersona(francisco);

        //assert -> comparo con lo que espero
        assertTrue(grupo3.getPersonas().size() == 1);
    }

}