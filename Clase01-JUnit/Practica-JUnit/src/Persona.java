import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Persona {
    private String nombre;
    private String apellido;
    private String email;
    private LocalDate fechaDeNacimiento;

    public Persona(String nombre, String apellido, String email, String fechaDeNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        // Parseamos la fecha de nacimiento de String a LocalDate
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.fechaDeNacimiento = LocalDate.parse(fechaDeNacimiento, formatter);
    }

    public String obtenerNombreCompleto() {
        return apellido + ", " + nombre;
    }

    public boolean esMayorDeEdad(LocalDate fecha) {
        // Devuelve un objeto Period que representa la diferencia entre startDate y endDate en términos de años, meses y días.
        Period edad = Period.between(fechaDeNacimiento, fecha);
        return edad.getYears() >= 18;
    }
}
