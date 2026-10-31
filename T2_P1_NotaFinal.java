import java.util.Scanner;

public class T2_P1_NotaFinal {
    public static void main(String[] args) {
        Scanner lectorDatos = new Scanner(System.in);

        double primeraNota, segundaNota, terceraNota, promedioCalculado;

        System.out.print("Ingrese la primera nota: ");
        primeraNota = lectorDatos.nextDouble();

        System.out.print("Ingrese la segunda nota: ");
        segundaNota = lectorDatos.nextDouble();

        System.out.print("Ingrese la tercera nota: ");
        terceraNota = lectorDatos.nextDouble();

        if (primeraNota >= 0 && primeraNota <= 20 &&
            segundaNota >= 0 && segundaNota <= 20 &&
            terceraNota >= 0 && terceraNota <= 20) {

            promedioCalculado = (primeraNota + segundaNota + terceraNota) / 3;

            System.out.printf("Promedio: %.2f%n", promedioCalculado);

            if (promedioCalculado >= 14) {
                System.out.println("Aprobado");
            } else if (promedioCalculado >= 9) {
                System.out.println("Supletorio");
            } else {
                System.out.println("Reprobado");
            }

        } else {
            System.out.println("Las notas deben estar entre 0 y 20");
        }
    }
}