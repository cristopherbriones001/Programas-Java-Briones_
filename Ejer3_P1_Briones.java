import java.util.Scanner;

public class Ejer3_P1_Briones {
    public static void main(String[] args) {
        Scanner lectorDatos = new Scanner(System.in);

        System.out.print("Ingrese un numero entero: ");
        int numeroIngresado = lectorDatos.nextInt();

        long numeroEvaluado = Math.abs((long) numeroIngresado);

        int cantidadCifras = 0;
        int sumaAcumulada = 0;

        if (numeroEvaluado == 0) {
            cantidadCifras = 1;
        }

        while (numeroEvaluado > 0) {
            int digitoActual = (int) (numeroEvaluado % 10);

            sumaAcumulada += digitoActual;
            cantidadCifras++;

            numeroEvaluado /= 10;
        }

        System.out.println("Cantidad de cifras: " + cantidadCifras);
        System.out.println("Suma de cifras: " + sumaAcumulada);

        lectorDatos.close();
    }
}
