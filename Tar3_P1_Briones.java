import java.util.Scanner;
import java.util.Locale;

public class Tar3_P1_Briones {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner lectorDatos = new Scanner(System.in);

        int horasTranscurridas;
        double importeParqueadero;

        System.out.print("Ingrese las horas: ");
        horasTranscurridas = lectorDatos.nextInt();

        if (horasTranscurridas <= 0) {
            System.out.println("Horas no validas");
        } else {
            if (horasTranscurridas == 1) {
                importeParqueadero = 1.00;
            } else {
                importeParqueadero = 1.00 + (horasTranscurridas - 1) * 0.50;
            }

            if (importeParqueadero > 6.00) {
                importeParqueadero = 6.00;
            }

            System.out.printf("Total: $%.2f%n", importeParqueadero);
        }

    }
}