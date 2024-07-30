public class MenuInfantil  extends Menu{
    private Integer juguete;

    public MenuInfantil(Double precioBase, Integer juguete) {
        super(precioBase);
        this.juguete = juguete;
    }

    public Integer getJuguete() {
        return juguete;
    }

    public void setJuguete(Integer juguete) {
        this.juguete = juguete;
    }

    @Override
    public String toString() {
        return "MenuInfantil{" +
                "juguete=" + juguete +
                '}';
    }
}
