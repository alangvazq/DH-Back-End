public class AnalistaDeCalidad {
    private CompruebaCalidad compruebaCalidad;

    public String checkControl(Articulo articulo){
        return compruebaCalidad.validarCalidadDelProducto(articulo);
    }

    public AnalistaDeCalidad() {
        compruebaCalidad = new CotrolLote();

        CompruebaCalidad peso = new ControlPeso();
        CompruebaCalidad envasado = new ControlEnvasado();

        compruebaCalidad.setSiguienteControl(peso);
        peso.setSiguienteControl(envasado);
    }
}
