import java.util.Scanner;

public class Ejer_P1_Briones {
    public static void main(String[] args) {
        Scanner lectorDatos = new Scanner(System.in);

        System.out.print("Ingrese un numero natural: ");
        int numeroIngresado = lectorDatos.nextInt();

        int sumaAcumulada = 0;

        for (int indiceActual = 1; indiceActual <= numeroIngresado; indiceActual++) {
            sumaAcumulada += indiceActual;
        }

        int sumaPorFormula = numeroIngresado * (numeroIngresado + 1) / 2;

        System.out.println("Suma con for: " + sumaAcumulada);
        System.out.println("Suma con formula: " + sumaPorFormula);
        System.out.println("Son iguales: " + (sumaAcumulada == sumaPorFormula));

        lectorDatos.close();
    }
}