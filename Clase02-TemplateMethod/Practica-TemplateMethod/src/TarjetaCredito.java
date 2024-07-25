public class TarjetaCredito extends Tarjeta{
    private double limite;
    private double saldoUtilizado;

    public TarjetaCredito(String numerosFrente, String codigoSeguridad, String fechaExpiracion, double limite, double saldoUtilizado) {
        super(numerosFrente, codigoSeguridad, fechaExpiracion);
        this.limite = limite;
        this.saldoUtilizado = saldoUtilizado;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public double getSaldoUtilizado() {
        return saldoUtilizado;
    }

    public void setSaldoUtilizado(double saldoUtilizado) {
        this.saldoUtilizado = saldoUtilizado;
    }

    @Override
    public String toString() {
        return "TarjetaCredito{" +
                "limite=" + limite +
                ", saldoUtilizado=" + saldoUtilizado +
                '}';
    }
}
