import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServicioDescargaProxyTest {
    @Test
    public void casoUno(){
        // Arrange
        Usuario usuario = new Usuario("123", TipoUsuario.PREMIUM);
        ServicioDescargaProxy servicioDescargaProxy = new ServicioDescargaProxy();
        String respuestaEsperada = "Descargando";

        // Act
        String respestaProxy = servicioDescargaProxy.descargarCancion(usuario);

        // Assert
        assertEquals(respuestaEsperada, respestaProxy);
    }

    @Test
    public void casoDos(){
        // Arrange
        Usuario usuario = new Usuario("123", TipoUsuario.FREE);
        ServicioDescargaProxy servicioDescargaProxy = new ServicioDescargaProxy();
        String respuestaEsperada = "Compra premium";

        // Act
        String respestaProxy = servicioDescargaProxy.descargarCancion(usuario);

        // Assert
        assertEquals(respuestaEsperada, respestaProxy);
    }
}