import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public abstract class ProcesadorPago {
    private String procesarPago(Tarjeta tarjeta, double monto){
        LocalDate fecha = LocalDate.now();
        // Validar fecha de expiración de tarjeta
        if (!validarFecha(tarjeta, fecha)){
            System.out.println("Tarjeta con fecha válida");
            // Autorizar tarjeta
            if (autorizar(tarjeta)){
                return "Pago autorizado";
            }
            return "Pago rechazado";
        }
        return "Tarjeta expirada";
    }

    private boolean validarFecha(Tarjeta tarjeta, LocalDate fecha){
        String fechaExpiracion = tarjeta.getFechaExpiracion();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate fechaFormateada = LocalDate.parse(fechaExpiracion, formatter);

        if (fechaFormateada.isAfter(fecha)){
            return true;
        }
        return false;
    }

    protected abstract boolean autorizar(Tarjeta tarjeta);
}
