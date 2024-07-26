public abstract class CompruebaCalidad {
    private CompruebaCalidad siguienteControl;

    public abstract String validarCalidadDelProducto(Articulo articulo);

    public CompruebaCalidad getSiguienteControl() {
        return siguienteControl;
    }

    public void setSiguienteControl(CompruebaCalidad siguienteControl) {
        this.siguienteControl = siguienteControl;
    }
}
