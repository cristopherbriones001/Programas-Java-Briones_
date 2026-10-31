import java.util.Locale;

public class Lab2_E1_Briones {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        for (int numeroFila = 1; numeroFila <= 10; numeroFila++) {
            for (int numeroColumna = 1; numeroColumna <= 10; numeroColumna++) {
                System.out.printf("%4d", numeroFila * numeroColumna);
            }
            System.out.println();
        }
    }
}
