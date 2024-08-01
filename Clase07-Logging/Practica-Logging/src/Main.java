public class Main {

    public static void main(String[] args) throws Exception {
        Leon leon = new Leon("Simba", 10, true);
        Leon leon1 = new Leon("Bom", -10, true);
        Tigre tigre = new Tigre("Tigre", 10);


        leon.correr();
        leon1.correr();
        leon1.esMayorA10();
        tigre.correr();
        tigre.correr();
    }
}
