import java.util.Scanner;

public class Lab2_E4_Briones {
    public static void main(String[] args) {
        Scanner lectorDatos = new Scanner(System.in);
        int alturaRombo;
        do {
            System.out.print("Ingrese un numero impar positivo: ");
            alturaRombo = lectorDatos.nextInt();
            if (alturaRombo <= 0 || alturaRombo % 2 == 0) {
                System.out.println("Tamano invalido. Intente otra vez.");
            }
        } while (alturaRombo <= 0 || alturaRombo % 2 == 0);
        int filaCentral = alturaRombo / 2;
        for (int numeroFila = 0; numeroFila < alturaRombo; numeroFila++) {
            int nivelRombo = numeroFila <= filaCentral ? numeroFila : alturaRombo - 1 - numeroFila;
            for (int indiceEspacio = 0; indiceEspacio < filaCentral - nivelRombo; indiceEspacio++) {
                System.out.print(" ");
            }
            for (int indiceEstrella = 0; indiceEstrella < 2 * nivelRombo + 1; indiceEstrella++) {
                System.out.print("*");
            }
            System.out.println();
        }
        lectorDatos.close();
    }
}