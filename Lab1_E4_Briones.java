import java.util.Scanner;
import java.util.Locale;

public class Lab1_E4_Briones {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner lectorDatos = new Scanner(System.in);

        String nombreProducto;
        int cantidadIngresada;
        double precioUnitario, importeSubtotal, importeIva, importeTotal;

        System.out.print("Ingrese el nombre del producto: ");
        nombreProducto = lectorDatos.nextLine();

        System.out.print("Ingrese la cantidad: ");
        cantidadIngresada = lectorDatos.nextInt();

        System.out.print("Ingrese el precio unitario: ");
        precioUnitario = lectorDatos.nextDouble();

        if (cantidadIngresada > 0 && precioUnitario >= 0) {

            importeSubtotal = cantidadIngresada * precioUnitario;
            importeIva = importeSubtotal * 0.15;
            importeTotal = importeSubtotal + importeIva;

            System.out.println("\nFACTURA");
            System.out.println("Producto: " + nombreProducto);
            System.out.println("Cantidad: " + cantidadIngresada);
            System.out.printf("Precio unitario: $%.2f%n", precioUnitario);
            System.out.printf("Subtotal: $%.2f%n", importeSubtotal);
            System.out.printf("IVA (15%%): $%.2f%n", importeIva);
            System.out.printf("Total: $%.2f%n", importeTotal);

        } else {
            System.out.println("Datos no validos");
        }

    }
}