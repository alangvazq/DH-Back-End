public class Arbol {
    private String tipo;
    private int alto;
    private int horizontal;
    private String color;

    public Arbol(String tipo, Integer alto, Integer horizontal, String color) {
        this.tipo = tipo;
        this.alto = alto;
        this.horizontal = horizontal;
        this.color = color;
    }

    public String getTipo() {
        return tipo;
    }

    public int getAlto() {
        return alto;
    }

    public int getHorizontal() {
        return horizontal;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Arbol{" +
                "tipo='" + tipo + '\'' +
                ", alto=" + alto +
                ", horizontal=" + horizontal +
                ", color='" + color + '\'' +
                '}';
    }
}
