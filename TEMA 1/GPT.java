import java.util.Scanner;

public class GPT {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.println("Bienvenidos a mi tienda");
        System.out.println("5 productos máximo, mi rey.");
        System.out.println("Introduzca el primer producto");

        double compra = 0;
        double compra_min = 50; // compra mínima para descuento
        double cesta = 0;
        double total_compra = 0;

        for (int i = 1; i <= 5; i++) { // Cambié el rango para incluir 5 productos correctamente
            System.out.println("Realice la compra del producto " + i + ":");
            compra = lector.nextDouble();

            double descompte_min = 0.06 * compra; // 6% de descuento
            double descompte_max = 15;
            double descuento_aplicado = 0; // Esta variable ya existía, solo la utilizo correctamente

            if (compra <= 0) {
                System.out.println("Los valores no pueden ser negativos, vuelve a introducir el precio.");
                i--; // Retrocede el contador si el valor es inválido
                continue; // Reinicia el bucle para evitar cálculos innecesarios
            }

            if (compra >= compra_min) {
                descuento_aplicado = descompte_min;
                if (descuento_aplicado >= descompte_max) {
                    descuento_aplicado = descompte_max;
                }
            } else {
                descuento_aplicado = 0; // Si no alcanza el mínimo, no hay descuento
            }

            total_compra = compra - descuento_aplicado; // Calcula el total con descuento
            System.out.println("Total del producto " + i + " después del descuento: $" + total_compra);

            cesta += total_compra; // Acumula el total de la compra en la cesta
        }

        System.out.println("Compra total: $" + cesta); // Imprime el total acumulado
    }
}
