import java.util.Scanner;
import java.util.Locale;

public class Tar4_P1_Briones {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner lectorDatos = new Scanner(System.in);

        double primerLado, segundoLado, tercerLado;

        System.out.print("Lado A: ");
        primerLado = lectorDatos.nextDouble();
        System.out.print("Lado B: ");
        segundoLado = lectorDatos.nextDouble();
        System.out.print("Lado C: ");
        tercerLado = lectorDatos.nextDouble();

        if (primerLado > 0 && segundoLado > 0 && tercerLado > 0 &&
            primerLado + segundoLado > tercerLado && primerLado + tercerLado > segundoLado && segundoLado + tercerLado > primerLado) {

            if (primerLado == segundoLado && segundoLado == tercerLado) {
                System.out.println("Equilatero");
            } else if (primerLado == segundoLado || primerLado == tercerLado || segundoLado == tercerLado) {
                System.out.println("Isosceles");
            } else {
                System.out.println("Escaleno");
            }
        } else {
            System.out.println("No forma un triangulo");
        }

        lectorDatos.close();
    }
}