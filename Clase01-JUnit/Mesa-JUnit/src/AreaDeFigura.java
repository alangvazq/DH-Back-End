public class AreaDeFigura {
    private final String CIRCULO = "círculo";
    private final String CUADRADO = "cuadrado";
    private final String figura;

    public AreaDeFigura(String figura) {
        if (figura == null || (!figura.equals(CIRCULO) && !figura.equals(CUADRADO))) {
            throw new IllegalArgumentException("Figura no reconocida. Las opciones válidas son: círculo, cuadrado.");
        }
        this.figura = figura;
    }

    public String calcularArea(double parametroDeFigura) {
        if (parametroDeFigura <= 0) {
            return "El valor del radio o lado debe ser mayor que cero.";
        }

        double area;
        switch (figura) {
            case CIRCULO:
                area = Math.PI * Math.pow(parametroDeFigura, 2);
                break;
            case CUADRADO:
                area = Math.pow(parametroDeFigura, 2);
                break;
            default:
                return "Figura no soportada.";
        }
        // Formatear número con el método String.format
        String areaFormateada = String.format("%.2f", area);
        /* %s es un marcador de posición que indica que se debe insertar una cadena en ese lugar.
        Si el marcador fuese %d, esperaría un número entero, y %f para números de punto flotante, etc.*/
        return String.format("El área del %s es %s unidades", figura, areaFormateada);
    }
}
