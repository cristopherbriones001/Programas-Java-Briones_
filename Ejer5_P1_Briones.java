public class Ejer5_P1_Briones {
    public static void main(String[] args) {

        int cantidadRegistrada = 0;

        System.out.println("Multiplos de 7 entre 1 y 100:");

        for (int indiceActual = 1; indiceActual <= 100; indiceActual++) {

            if (indiceActual % 7 == 0) {
                System.out.println(indiceActual);
                cantidadRegistrada++;
            }
        }

        System.out.println("Cantidad de multiplos: " + cantidadRegistrada);
    }
}
