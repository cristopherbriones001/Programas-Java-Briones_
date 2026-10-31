import java.util.Locale;
import java.util.Scanner;

public class Lab2_E2_Briones {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner lectorDatos = new Scanner(System.in);
        int cantidadIngresada = 0;
        double sumaAcumulada = 0, temperaturaMinima = 0, temperaturaMaxima = 0;
        System.out.print("Temperatura (negativa para terminar): ");
        double temperaturaLeida = lectorDatos.nextDouble();
        while (temperaturaLeida >= 0) {
            if (cantidadIngresada == 0) {
                temperaturaMinima = temperaturaLeida;
                temperaturaMaxima = temperaturaLeida;
            } else {
                if (temperaturaLeida < temperaturaMinima) temperaturaMinima = temperaturaLeida;
                if (temperaturaLeida > temperaturaMaxima) temperaturaMaxima = temperaturaLeida;
            }
            sumaAcumulada += temperaturaLeida;
            cantidadIngresada++;
            System.out.print("Temperatura (negativa para terminar): ");
            temperaturaLeida = lectorDatos.nextDouble();
        }
        if (cantidadIngresada == 0) {
            System.out.println("No hubo lecturas validas.");
        } else {
            System.out.printf("Lecturas: %d Promedio: %.2f Max: %.2f Min: %.2f%n",
                    cantidadIngresada, sumaAcumulada / cantidadIngresada, temperaturaMaxima, temperaturaMinima);
        }
        lectorDatos.close();
    }
}