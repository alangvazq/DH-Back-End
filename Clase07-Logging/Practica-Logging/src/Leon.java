import org.apache.log4j.Logger;

public class Leon {
    private static final Logger logger = Logger.getLogger(Leon.class);
    private String nombre;
    private int edad;

    private boolean esAlfa;

    public Leon(String nombre, int edad, boolean esAlfa) {
        this.nombre = nombre;
        this.edad = edad;
        this.esAlfa = esAlfa;
    }

    public void correr(){
        logger.info("El León "+ nombre + " está corriendo");
    }

    public void esMayorA10() throws Exception {
        try{
            esMenorA10();
        }catch (Exception e){
            logger.error("La edad del León " + nombre + " es incorrecta", e);
        }
    }

    public void esMenorA10() throws Exception {
        if (edad > 10 && esAlfa) {
            logger.info("Tigre es mayor a 10 anios");
        } else if (edad < 0) {
            throw new Exception("La edad no puede ser negativa");
        }
    }
}
