import java.util.Scanner;

public class DescompteControlErrors {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        // Declaramos las constantes del ejercicio
        double descuentoPorcentaje = 0.08;
        double compraMinimaParaDescuento = 100;
        double descuentoMaximo = 10;

        // Solicitar el precio al usuario
        System.out.println("Agrega el precio del producto:");
        double precioOriginal = lector.nextDouble();

        // Comprobar si el precio es positivo
        if (precioOriginal < 0) {
            System.out.println("Error: El precio no puede ser negativo.");
        } else {
            // Comprobar si el precio cumple el mínimo para el descuento
            if (precioOriginal >= compraMinimaParaDescuento) {
                // Calcular el descuento
                double descuento = precioOriginal * descuentoPorcentaje;

                // Comprobar si el descuento supera el máximo permitido
                if (descuento > descuentoMaximo) {
                    descuento = descuentoMaximo;
                }

                // Aplicar el descuento al precio original
                double precioFinal = precioOriginal - descuento;
                System.out.println("El precio con descuento es: " + precioFinal + " euros");
            } else {
                // Si no se cumple el mínimo para el descuento
                double restante = compraMinimaParaDescuento - precioOriginal;
                System.out.println("No has gastado lo suficiente. Te faltan: " + restante + " euros para obtener el descuento.");
            }
        }
        lector.close();
    }
}
