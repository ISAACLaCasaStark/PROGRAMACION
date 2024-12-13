import java.util.Scanner;

public class Tarea2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir número de columnas
        System.out.println("Por favor, ingrese cuántas columnas tendrá la matriz:");
        int columnas = scanner.nextInt();

        
        int[][] matriz = new int[5][columnas];

        // Llenar la matriz con números aleatorios entre 0 y 10
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = (int) (Math.random() * 11); // Generar número aleatorio
            }
        }

        // Mostrar la matriz
        System.out.println("Aquí está la matriz generada:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j] + " "); // Imprimir cada valor
            }
            System.out.println();
        }

    }
}
