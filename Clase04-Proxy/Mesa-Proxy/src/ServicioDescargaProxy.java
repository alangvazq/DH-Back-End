public class ServicioDescargaProxy implements IServicioDescarga{
    private ServicioDescarga servicioDescarga;

    public ServicioDescargaProxy() {
        this.servicioDescarga = new ServicioDescarga();
    }

    @Override
    public String descargarCancion(Usuario usuario) {
        if(usuario.getTipo() == TipoUsuario.PREMIUM){
            return servicioDescarga.descargarCancion(usuario);
        }
        return "Compra premium";
    }
}
