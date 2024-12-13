import java.util.Scanner;

public class Tarea5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir tamaño de la matriz
        System.out.println("Ingrese el tamaño de la matriz (n x n): ");
        int n = scanner.nextInt();

        // Verificar que el tamaño sea válido
        if (n <= 0) {
            System.out.println("El tamaño de la matriz debe ser mayor a 0.");
            return;
        }

        // Crear la matriz
        int[][] matriz = new int[n][n];

        // Llenar la matriz con números entre 0 y 10
        System.out.println("Ingrese los números de la matriz (números entre 0 y 10): ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int valor = -1; // Inicializar el valor a algo fuera de rango
                while (valor < 0 || valor > 10) {
                    System.out.print("Elemento [" + i + "][" + j + "]: ");
                    valor = scanner.nextInt();
                    if (valor < 0 || valor > 10) {
                        System.out.println("El número debe estar entre 0 y 10. Intenta de nuevo.");
                    }
                }
                matriz[i][j] = valor;
            }
        }

        // Contar cuántas veces aparece cada número
        int[] contador = new int[11]; // Para contar los números del 0 al 10

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int numero = matriz[i][j];
                contador[numero]++; // Aumentar el contador del número encontrado
            }
        }

        // Mostrar cuántas veces aparece cada número
        System.out.println("Las veces que aparece cada número en la matriz:");
        for (int i = 0; i <= 10; i++) {
            if (contador[i] > 0) {
                System.out.println(i + " aparece " + contador[i] + " vez/veces.");
            }
        }

    }
}
