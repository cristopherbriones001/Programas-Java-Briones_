import java.util.Scanner;
import java.util.Locale;

public class Lab1_E1_Briones {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner lectorDatos = new Scanner(System.in);

        double gradosCelsius, gradosFahrenheit, gradosKelvin;

        System.out.print("Ingrese la temperatura en Celsius: ");
        gradosCelsius = lectorDatos.nextDouble();

        gradosFahrenheit = (gradosCelsius * 9.0 / 5.0) + 32;
        gradosKelvin = gradosCelsius + 273.15;

        if (gradosKelvin < 0) {
            System.out.println("Temperatura no valida");
        } else {
            System.out.printf("Fahrenheit: %.2f F%n", gradosFahrenheit);
            System.out.printf("Kelvin: %.2f K%n", gradosKelvin);
        }

    }
}