import java.util.Scanner;

public class T2_P1_Resistencias {
    public static void main(String[] args) {
        Scanner lectorDatos = new Scanner(System.in);

        double primeraResistencia, segundaResistencia, resistenciaEquivalente;
        char tipoConexion;

        System.out.print("Ingrese la primera resistencia: ");
        primeraResistencia = lectorDatos.nextDouble();

        System.out.print("Ingrese la segunda resistencia: ");
        segundaResistencia = lectorDatos.nextDouble();

        if (primeraResistencia > 0 && segundaResistencia > 0) {

            System.out.print("Tipo de conexion (S/P): ");
            tipoConexion = lectorDatos.next().toUpperCase().charAt(0);

            switch (tipoConexion) {
                case 'S':
                    resistenciaEquivalente = primeraResistencia + segundaResistencia;
                    System.out.println("Resistencia equivalente: "
                            + resistenciaEquivalente + " ohmios");
                    break;

                case 'P':
                    resistenciaEquivalente = (primeraResistencia * segundaResistencia) / (primeraResistencia + segundaResistencia);
                    System.out.println("Resistencia equivalente: "
                            + resistenciaEquivalente + " ohmios");
                    break;

                default:
                    System.out.println("Tipo de conexion incorrecto");
            }

        } else {
            System.out.println("Las resistencias deben ser positivas");
        }
    }
}