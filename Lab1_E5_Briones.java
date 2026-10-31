import java.util.Scanner;
import java.util.Locale;

public class Lab1_E5_Briones {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner lectorDatos = new Scanner(System.in);

        int primerNumero, segundoNumero, sumaAcumulada, resta, resultadoMultiplicacion, restoCalculado;
        double cocienteReal;
        boolean esMayor, esMenor, sonIguales, ambosPositivos, algunoMayorDiez;

        System.out.print("Ingrese el valor de A: ");
        primerNumero = lectorDatos.nextInt();

        System.out.print("Ingrese el valor de B: ");
        segundoNumero = lectorDatos.nextInt();

        sumaAcumulada = primerNumero + segundoNumero;
        resta = primerNumero - segundoNumero;
        resultadoMultiplicacion = primerNumero * segundoNumero;

        System.out.println("\nOPERACIONES ARITMETICAS");
        System.out.println("Suma: " + sumaAcumulada);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicacion: " + resultadoMultiplicacion);

        if (segundoNumero != 0) {
            cocienteReal = (double) primerNumero / segundoNumero;
            restoCalculado = primerNumero % segundoNumero;

            System.out.printf("Division real: %.2f%n", cocienteReal);
            System.out.println("Residuo: " + restoCalculado);
        } else {
            System.out.println("No se puede dividir entre cero");
        }

        esMayor = primerNumero > segundoNumero;
        esMenor = primerNumero < segundoNumero;
        sonIguales = primerNumero == segundoNumero;

        System.out.println("\nOPERACIONES RELACIONALES");
        System.out.println("A > B: " + esMayor);
        System.out.println("A < B: " + esMenor);
        System.out.println("A == B: " + sonIguales);

        ambosPositivos = primerNumero > 0 && segundoNumero > 0;
        algunoMayorDiez = primerNumero > 10 || segundoNumero > 10;

        System.out.println("\nOPERACIONES LOGICAS");
        System.out.println("Ambos son positivos: " + ambosPositivos);
        System.out.println("Alguno es mayor que 10: " + algunoMayorDiez);

    }
}