public abstract class ProcesarMenu{
    public String armarMenu(Menu menu){
        Double calculo = calcularPrecioVenta(menu);
        if(menu instanceof MenuInfantil){
            return "Menú infantil";
        } else if (menu instanceof MenuVegetariano){
            return "Menú vegetariano";
        } else {
            return "Menú clásico";
        }
    }

    protected abstract Double calcularPrecioVenta(Menu menu);
}
