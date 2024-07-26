public class CotrolLote extends CompruebaCalidad{

    @Override
    public String validarCalidadDelProducto(Articulo articulo) {
        if (articulo.getLote() >= 1000 && articulo.getLote() <= 2000){
            return getSiguienteControl().validarCalidadDelProducto(articulo);
        }
        return "Rechazado";
    }
}
