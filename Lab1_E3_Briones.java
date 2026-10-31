import java.util.Scanner;
import java.util.Locale;

public class Lab1_E3_Briones {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner lectorDatos = new Scanner(System.in);

        int numeroEvaluado, cifraCentenas, cifraDecenas, cifraUnidades;

        System.out.print("Ingrese un numero de tres cifras: ");
        numeroEvaluado = lectorDatos.nextInt();

        if (numeroEvaluado >= 100 && numeroEvaluado <= 999) {

            cifraCentenas = numeroEvaluado / 100;
            cifraDecenas = (numeroEvaluado % 100) / 10;
            cifraUnidades = numeroEvaluado % 10;

            System.out.println("Centenas: " + cifraCentenas);
            System.out.println("Decenas: " + cifraDecenas);
            System.out.println("Unidades: " + cifraUnidades);

        } else {
            System.out.println("Debe ingresar un numero de tres cifras");
        }

    }
}