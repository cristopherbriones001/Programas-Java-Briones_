import java.util.Scanner;
import java.util.Locale;

public class Tar1_P1_Briones {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner lectorDatos = new Scanner(System.in);

        double coeficienteCuadratico, coeficienteLineal, terminoIndependiente, discriminante, primeraRaiz, segundaRaiz;

        System.out.print("Ingrese a: ");
        coeficienteCuadratico = lectorDatos.nextDouble();
        System.out.print("Ingrese b: ");
        coeficienteLineal = lectorDatos.nextDouble();
        System.out.print("Ingrese c: ");
        terminoIndependiente = lectorDatos.nextDouble();

        discriminante = coeficienteLineal * coeficienteLineal - 4 * coeficienteCuadratico * terminoIndependiente;

        if (coeficienteCuadratico != 0 && discriminante > 0) {
            primeraRaiz = (-coeficienteLineal + Math.sqrt(discriminante)) / (2 * coeficienteCuadratico);
            segundaRaiz = (-coeficienteLineal - Math.sqrt(discriminante)) / (2 * coeficienteCuadratico);

            System.out.println("X1 = " + primeraRaiz);
            System.out.println("X2 = " + segundaRaiz);
        } else {
            System.out.println("No se cumplen las condiciones");
        }

    }
}