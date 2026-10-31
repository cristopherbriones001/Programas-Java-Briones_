import java.util.Locale;
import java.util.Scanner;

public class Lab2_E5_Briones {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner lectorDatos = new Scanner(System.in);
        double saldoDisponible = 500.0;
        int opcionSeleccionada;
        do {
            System.out.println("\n1. Consultar saldo");
            System.out.println("2. Depositar");
            System.out.println("3. Retirar");
            System.out.println("0. Salir");
            System.out.print("Opcion: ");
            opcionSeleccionada = lectorDatos.nextInt();
            switch (opcionSeleccionada) {
                case 1:
                    System.out.printf("Saldo: $%.2f%n", saldoDisponible);
                    break;
                case 2:
                    System.out.print("Monto a depositar: ");
                    double montoDeposito = lectorDatos.nextDouble();
                    if (montoDeposito > 0) {
                        saldoDisponible += montoDeposito;
                        System.out.println("Deposito aceptado.");
                    } else {
                        System.out.println("Monto invalido.");
                    }
                    break;
                case 3:
                    System.out.print("Monto a retirar: ");
                    double montoRetiro = lectorDatos.nextDouble();
                    if (montoRetiro <= 0) {
                        System.out.println("Monto invalido.");
                    } else if (montoRetiro > saldoDisponible) {
                        System.out.println("Fondos insuficientes.");
                    } else {
                        saldoDisponible -= montoRetiro;
                        System.out.println("Retiro aceptado.");
                    }
                    break;
                case 0:
                    System.out.println("Fin del programa.");
                    break;
                default:
                    System.out.println("Opcion invalida.");
            }
        } while (opcionSeleccionada != 0);
        lectorDatos.close();
    }
}
