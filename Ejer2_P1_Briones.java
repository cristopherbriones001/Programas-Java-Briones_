import java.util.Scanner;

public class Ejer2_P1_Briones {
    public static void main(String[] args) {
        Scanner lectorDatos = new Scanner(System.in);

        int numeroIngresado;

        do {
            System.out.print("Ingrese un numero mayor o igual a 0: ");
            numeroIngresado = lectorDatos.nextInt();

        } while (numeroIngresado < 0);

        long factorialCalculado = 1;

        for (int indiceActual = 1; indiceActual <= numeroIngresado; indiceActual++) {
            factorialCalculado *= indiceActual;
        }

        System.out.println("El factorial de " + numeroIngresado + " es: " + factorialCalculado);

        lectorDatos.close();
    }
}
