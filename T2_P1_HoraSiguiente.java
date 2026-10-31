import java.util.Scanner;

public class T2_P1_HoraSiguiente {
    public static void main(String[] args) {
        Scanner lectorDatos = new Scanner(System.in);

        int horaIngresada, minutoIngresado, segundoIngresado;

        System.out.print("Ingrese la hora: ");
        horaIngresada = lectorDatos.nextInt();

        System.out.print("Ingrese los minutos: ");
        minutoIngresado = lectorDatos.nextInt();

        System.out.print("Ingrese los segundos: ");
        segundoIngresado = lectorDatos.nextInt();

        if (horaIngresada >= 0 && horaIngresada <= 23 &&
            minutoIngresado >= 0 && minutoIngresado <= 59 &&
            segundoIngresado >= 0 && segundoIngresado <= 59) {

            segundoIngresado++;

            if (segundoIngresado == 60) {
                segundoIngresado = 0;
                minutoIngresado++;
            }

            if (minutoIngresado == 60) {
                minutoIngresado = 0;
                horaIngresada++;
            }

            if (horaIngresada == 24) {
                horaIngresada = 0;
            }

            System.out.printf("%02d:%02d:%02d%n", horaIngresada, minutoIngresado, segundoIngresado);

        } else {
            System.out.println("Hora incorrecta");
        }
    }
}