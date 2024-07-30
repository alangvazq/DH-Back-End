public class MenuVegetariano extends Menu{
    private boolean especias;
    private Integer salsaVegetariana;

    public MenuVegetariano(Double precioBase, boolean especias, Integer salsaVegetariana) {
        super(precioBase);
        this.especias = especias;
        this.salsaVegetariana = salsaVegetariana;
    }

    public boolean isEspecias() {
        return especias;
    }

    public void setEspecias(boolean especias) {
        this.especias = especias;
    }

    public Integer getSalsaVegetariana() {
        return salsaVegetariana;
    }

    public void setSalsaVegetariana(Integer salsaVegetariana) {
        this.salsaVegetariana = salsaVegetariana;
    }

    @Override
    public String toString() {
        return "MenuVegetariano{" +
                "especias=" + especias +
                ", salsaVegetariana=" + salsaVegetariana +
                '}';
    }
}
