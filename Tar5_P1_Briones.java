import java.util.Scanner;
import java.util.Locale;

public class Tar5_P1_Briones {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner lectorDatos = new Scanner(System.in);

        int opcionSeleccionada;
        double valorIngresado, valorConvertido;

        System.out.println("1. Metros a pies");
        System.out.println("2. Kilogramos a libras");
        System.out.println("3. Celsius a Fahrenheit");

        System.out.print("Seleccione: ");
        opcionSeleccionada = lectorDatos.nextInt();

        switch (opcionSeleccionada) {
            case 1:
                System.out.print("Metros: ");
                valorIngresado = lectorDatos.nextDouble();
                valorConvertido = valorIngresado * 3.28084;
                System.out.printf("%.2f pies%n", valorConvertido);
                break;

            case 2:
                System.out.print("Kilogramos: ");
                valorIngresado = lectorDatos.nextDouble();
                valorConvertido = valorIngresado * 2.20462;
                System.out.printf("%.2f libras%n", valorConvertido);
                break;

            case 3:
                System.out.print("Celsius: ");
                valorIngresado = lectorDatos.nextDouble();
                valorConvertido = valorIngresado * 9 / 5 + 32;
                System.out.printf("%.2f Fahrenheit%n", valorConvertido);
                break;

            default:
                System.out.println("Opcion incorrecta");
        }

    }
}