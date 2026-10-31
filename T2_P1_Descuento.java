import java.util.Scanner;

public class T2_P1_Descuento {
    public static void main(String[] args) {
        Scanner lectorDatos = new Scanner(System.in);

        final double PRECIO = 8.50;
        final double IVA = 0.15;
        final double DESCUENTO1 = 0.05;
        final double DESCUENTO2 = 0.10;

        int cantidadIngresada;
        double importeSubtotal, importeDescuento, importeTotal, importeImpuesto;

        System.out.print("Ingrese la cantidad de sacos: ");
        cantidadIngresada = lectorDatos.nextInt();

        if (cantidadIngresada > 0) {

            importeSubtotal = cantidadIngresada * PRECIO;

            if (cantidadIngresada <= 20) {
                importeDescuento = 0;
            } else if (cantidadIngresada <= 50) {
                importeDescuento = importeSubtotal * DESCUENTO1;
            } else {
                importeDescuento = importeSubtotal * DESCUENTO2;
            }

            importeImpuesto = (importeSubtotal - importeDescuento) * IVA;
            importeTotal = importeSubtotal - importeDescuento + importeImpuesto;

            System.out.printf("Subtotal: $%.2f%n", importeSubtotal);
            System.out.printf("Descuento: $%.2f%n", importeDescuento);
            System.out.printf("IVA: $%.2f%n", importeImpuesto);
            System.out.printf("Total: $%.2f%n", importeTotal);

        } else {
            System.out.println("Cantidad incorrecta");
        }
    }
}