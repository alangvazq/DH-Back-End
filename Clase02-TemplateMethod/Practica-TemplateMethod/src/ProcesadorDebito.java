public class ProcesadorDebito extends ProcesadorPago{
    boolean respuesta = false;
    @Override
    protected boolean autorizar(Tarjeta tarjeta) {
        if (tarjeta instanceof TarjetaDebito){
            TarjetaDebito tarjetaDebito = (TarjetaDebito) tarjeta;
            return tarjetaDebito.getSaldoDisponible() > 0;
        }
        return respuesta;
    }
}
