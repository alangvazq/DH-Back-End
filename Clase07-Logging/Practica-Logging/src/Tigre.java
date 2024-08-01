import org.apache.log4j.Logger;

public class Tigre {
    private static final Logger logger = Logger.getLogger(Tigre.class);
    private String nombre;
    private int edad;

    public Tigre(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void correr(){
        logger.info("El Tigre "+ nombre + " está corriendo");
    }

    public void esMayorA10() throws Exception {
            if (edad > 10) {
                logger.info("Tigre es mayor a 10 anios");
            } else if (edad < 0) {
                logger.error("La edad del Tigre " + nombre + "es incorrecta");
                throw new Exception("La edad no puede ser negativa");
            }
    }
}
