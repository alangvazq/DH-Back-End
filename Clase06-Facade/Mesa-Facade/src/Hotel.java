public class Hotel {
    private String fechaEntrada;
    private String fechaSalida;
    private String ciudad;

    public Hotel(String fechaEntreda, String fechaSalida, String ciudad) {
        this.fechaEntrada = fechaEntreda;
        this.fechaSalida = fechaSalida;
        this.ciudad = ciudad;
    }

    public String getFechaEntrada() {
        return fechaEntrada;
    }

    public String getFechaSalida() {
        return fechaSalida;
    }

    public String getCiudad() {
        return ciudad;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "fechaEntrada='" + fechaEntrada + '\'' +
                ", fechaSalida='" + fechaSalida + '\'' +
                ", ciudad='" + ciudad + '\'' +
                '}';
    }
}
