import java.util.Scanner;

public class Ejer4_P1_Briones {
    public static void main(String[] args) {
        Scanner lectorDatos = new Scanner(System.in);

        double temperaturaIngresada;
        double temperaturaMaxima = 0;
        double temperaturaMinima = 0;
        double sumaAcumulada = 0;
        int cantidadRegistrada = 0;

        System.out.print("Ingrese una temperatura (-999 para terminar): ");
        temperaturaIngresada = lectorDatos.nextDouble();

        while (temperaturaIngresada != -999) {

            if (cantidadRegistrada == 0) {
                temperaturaMaxima = temperaturaIngresada;
                temperaturaMinima = temperaturaIngresada;
            }

            if (temperaturaIngresada > temperaturaMaxima) {
                temperaturaMaxima = temperaturaIngresada;
            }

            if (temperaturaIngresada < temperaturaMinima) {
                temperaturaMinima = temperaturaIngresada;
            }

            sumaAcumulada += temperaturaIngresada;
            cantidadRegistrada++;

            System.out.print("Ingrese otra temperatura (-999 para terminar): ");
            temperaturaIngresada = lectorDatos.nextDouble();
        }

        if (cantidadRegistrada > 0) {
            double promedioCalculado = sumaAcumulada / cantidadRegistrada;

            System.out.println("Temperatura mayor: " + temperaturaMaxima);
            System.out.println("Temperatura menor: " + temperaturaMinima);
            System.out.println("Promedio: " + promedioCalculado);
        } else {
            System.out.println("No se ingresaron temperaturas.");
        }

        lectorDatos.close();
    }
}
