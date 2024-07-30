public class ProcesarMenuVegetariano extends ProcesarMenu{
    @Override
    protected Double calcularPrecioVenta(Menu menu) {
        if (menu instanceof MenuVegetariano){
            MenuVegetariano menuVegetariano = (MenuVegetariano) menu;
            if (menuVegetariano.isEspecias()){
                Double adicionalEspecias = menu.getPrecioBase() * 0.01;
                return menu.getPrecioBase() +adicionalEspecias + menuVegetariano.getSalsaVegetariana() * 2.0;
            }
            return menu.getPrecioBase() + menuVegetariano.getSalsaVegetariana() * 2.0;
        }
        return 0.0;
    }
}
