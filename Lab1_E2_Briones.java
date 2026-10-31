import java.util.Scanner;
import java.util.Locale;

public class Lab1_E2_Briones {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner lectorDatos = new Scanner(System.in);

        int segundosTotales, horasTranscurridas, minutosCalculados, segundosCalculados, restoCalculado;

        System.out.print("Ingrese el tiempo en segundos: ");
        segundosTotales = lectorDatos.nextInt();

        if (segundosTotales >= 0) {

            horasTranscurridas = segundosTotales / 3600;
            restoCalculado = segundosTotales % 3600;
            minutosCalculados = restoCalculado / 60;
            segundosCalculados = restoCalculado % 60;

            System.out.println("Horas: " + horasTranscurridas);
            System.out.println("Minutos: " + minutosCalculados);
            System.out.println("Segundos: " + segundosCalculados);

        } else {
            System.out.println("Tiempo no valido");
        }

    }
}