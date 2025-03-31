import java.util.Scanner;

public class Tarea3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir el tamaño de las matrices
        System.out.println("Por favor, ingrese el tamaño de las matrices (n x n):");
        int n = scanner.nextInt();

        // Crear las matrices
        int[][] matriz1 = new int[n][n];
        int[][] matriz2 = new int[n][n];
        int[][] matrizSuma = new int[n][n];

        // Llenar la primera matriz con valores
        System.out.println("Ingrese los valores para la primera matriz:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Ingrese el valor para la posición [" + i + "][" + j + "]:");
                matriz1[i][j] = scanner.nextInt();
            }
        }

        // Llenar la segunda matriz con valores
        System.out.println("Ingrese los valores para la segunda matriz:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Ingrese el valor para la posición [" + i + "][" + j + "]:");
                matriz2[i][j] = scanner.nextInt();
            }
        }

        // Sumar las matrices
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrizSuma[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }

        // Mostrar la primera matriz
        System.out.println("Primera matriz:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz1[i][j] + " ");
            }
            System.out.println();
        }

        // Mostrar la segunda matriz
        System.out.println("Segunda matriz:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz2[i][j] + " ");
            }
            System.out.println();
        }

        // Mostrar la matriz suma
        System.out.println("Suma de las matrices:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrizSuma[i][j] + " ");
            }
            System.out.println();
        }

    }
}
