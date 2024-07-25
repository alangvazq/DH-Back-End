public class ProcesadorCredito extends ProcesadorPago{
    boolean respuesta = false;
    @Override
    protected boolean autorizar(Tarjeta tarjeta) {
        if (tarjeta instanceof TarjetaCredito){
            TarjetaCredito tarjetaCredito = (TarjetaCredito) tarjeta;
            return tarjetaCredito.getSaldoUtilizado() < tarjetaCredito.getLimite();
        }
        return respuesta;
    }
}
