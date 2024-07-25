public class TarjetaDebito extends Tarjeta {
    private double saldoDisponible;

    public TarjetaDebito(String numerosFrente, String codigoSeguridad, String fechaExpiracion, double saldoDisponible) {
        super(numerosFrente, codigoSeguridad, fechaExpiracion);
        this.saldoDisponible = saldoDisponible;
    }

    public double getSaldoDisponible() {
        return saldoDisponible;
    }

    public void setSaldoDisponible(double saldoDisponible) {
        this.saldoDisponible = saldoDisponible;
    }

    @Override
    public String toString() {
        return "TarjetaDebito{" +
                "saldoDisponible=" + saldoDisponible +
                '}';
    }
}
