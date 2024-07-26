public class ControlEnvasado extends CompruebaCalidad{
    @Override
    public String validarCalidadDelProducto(Articulo articulo) {
        if (articulo.getEnvasado().equals("Sano") || articulo.getEnvasado().equals("Casi sano")){
            return "Control de calidad aceptado";
        }
        return "Rechazado";
    }
}
