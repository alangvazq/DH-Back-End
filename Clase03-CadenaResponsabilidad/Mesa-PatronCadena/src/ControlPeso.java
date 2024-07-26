public class ControlPeso extends CompruebaCalidad{
    @Override
    public String validarCalidadDelProducto(Articulo articulo) {
        if (articulo.getPeso() >= 1200 && articulo.getPeso() <= 1300){
            return getSiguienteControl().validarCalidadDelProducto(articulo);
        }
        return "Rechazado";
    }
}
