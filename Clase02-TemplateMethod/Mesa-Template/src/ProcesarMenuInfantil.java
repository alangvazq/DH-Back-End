public class ProcesarMenuInfantil extends ProcesarMenu{

    @Override
    protected Double calcularPrecioVenta(Menu menu) {
        if (menu instanceof Menu){
            MenuInfantil menuInfantil = (MenuInfantil) menu;
            return menuInfantil.getJuguete() * 3.0;
        }
        return 0.0;
    }
}
