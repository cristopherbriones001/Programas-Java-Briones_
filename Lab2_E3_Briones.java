import java.util.Random;
import java.util.Scanner;

public class Lab2_E3_Briones {
    public static void main(String[] args) {
        Scanner lectorDatos = new Scanner(System.in);
        Random generadorAleatorio = new Random();
        int numeroSecreto = generadorAleatorio.nextInt(100) + 1;
        int intentosRealizados = 0;
        boolean numeroAdivinado = false;
        do {
            System.out.print("Adivina un numero del 1 al 100: ");
            int numeroPropuesto = lectorDatos.nextInt();
            intentosRealizados++;
            if (numeroPropuesto == numeroSecreto) {
                numeroAdivinado = true;
                System.out.println("Acertaste en " + intentosRealizados + " intento(s).");
            } else if (numeroPropuesto < numeroSecreto) {
                System.out.println("Mas alto.");
            } else {
                System.out.println("Mas bajo.");
            }
        } while (!numeroAdivinado && intentosRealizados < 7);
        if (!numeroAdivinado) System.out.println("Sin intentos. El numero era: " + numeroSecreto);
        lectorDatos.close();
    }
}