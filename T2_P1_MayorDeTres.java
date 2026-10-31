import java.util.Scanner;

public class T2_P1_MayorDeTres {
    public static void main(String[] args) {
        Scanner lectorDatos = new Scanner(System.in);

        int primerNumero, segundoNumero, tercerNumero;

        System.out.print("Ingrese el primer numero: ");
        primerNumero = lectorDatos.nextInt();

        System.out.print("Ingrese el segundo numero: ");
        segundoNumero = lectorDatos.nextInt();

        System.out.print("Ingrese el tercer numero: ");
        tercerNumero = lectorDatos.nextInt();

        if (primerNumero != segundoNumero && primerNumero != tercerNumero && segundoNumero != tercerNumero) {

            if (primerNumero > segundoNumero && segundoNumero > tercerNumero) {
                System.out.println(primerNumero + " " + segundoNumero + " " + tercerNumero);

            } else if (primerNumero > tercerNumero && tercerNumero > segundoNumero) {
                System.out.println(primerNumero + " " + tercerNumero + " " + segundoNumero);

            } else if (segundoNumero > primerNumero && primerNumero > tercerNumero) {
                System.out.println(segundoNumero + " " + primerNumero + " " + tercerNumero);

            } else if (segundoNumero > tercerNumero && tercerNumero > primerNumero) {
                System.out.println(segundoNumero + " " + tercerNumero + " " + primerNumero);

            } else if (tercerNumero > primerNumero && primerNumero > segundoNumero) {
                System.out.println(tercerNumero + " " + primerNumero + " " + segundoNumero);

            } else {
                System.out.println(tercerNumero + " " + segundoNumero + " " + primerNumero);
            }

        } else {
            System.out.println("Los numeros deben ser diferentes");
        }
    }
}