public abstract class Tarjeta {
    private String numerosFrente;
    private String codigoSeguridad;
    private String fechaExpiracion;

    public Tarjeta(String numerosFrente, String codigoSeguridad, String fechaExpiracion) {
        this.numerosFrente = numerosFrente;
        this.codigoSeguridad = codigoSeguridad;
        this.fechaExpiracion = fechaExpiracion;
    }

    public String getNumerosFrente() {
        return numerosFrente;
    }

    public void setNumerosFrente(String numerosFrente) {
        this.numerosFrente = numerosFrente;
    }

    public String getCodigoSeguridad() {
        return codigoSeguridad;
    }

    public void setCodigoSeguridad(String codigoSeguridad) {
        this.codigoSeguridad = codigoSeguridad;
    }

    public String getFechaExpiracion() {
        return fechaExpiracion;
    }

    public void setFechaExpiracion(String fechaExpiracion) {
        this.fechaExpiracion = fechaExpiracion;
    }

    @Override
    public String toString() {
        return "Tarjeta{" +
                "numerosFrente='" + numerosFrente + '\'' +
                ", codigoSeguridad='" + codigoSeguridad + '\'' +
                ", fechaExpiracion='" + fechaExpiracion + '\'' +
                '}';
    }
}
