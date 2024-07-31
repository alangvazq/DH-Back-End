public class Main {
    public static void main(String[] args) {
        Bosque bosque = new Bosque();

        for (int i = 0; i < 50; i++) {
            bosque.plantarArboles("Frutales", 500, 300, "rojo");
            bosque.plantarArboles("Ornamentales", 200, 400, "verde");
        }

        Runtime runtime = Runtime.getRuntime();
        System.out.println("Memoria usada: " + (runtime.totalMemory() - runtime.freeMemory()) / (1024 * 1024) + " MB");
    }
}
