import java.util.Scanner;
import java.util.Locale;

public class Tar2_P1_Briones {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner lectorDatos = new Scanner(System.in);

        int anioIngresado;

        System.out.print("Ingrese el anio: ");
        anioIngresado = lectorDatos.nextInt();

        if (anioIngresado > 0) {
            if (anioIngresado % 400 == 0) {
                System.out.println("Es bisiesto");
            } else if (anioIngresado % 100 == 0) {
                System.out.println("No es bisiesto");
            } else if (anioIngresado % 4 == 0) {
                System.out.println("Es bisiesto");
            } else {
                System.out.println("No es bisiesto");
            }
        } else {
            System.out.println("Anio no valido");
        }

    }
}