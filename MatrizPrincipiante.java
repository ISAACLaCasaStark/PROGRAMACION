// Este programa crea una matriz 2D (tabla) y la imprime
public class MatrizPrincipiante {
    public static void main(String[] args) {
        // Declarar la matriz
        int[][] matriz = new int[3][3]; // Matriz de 3x3

        // Rellenar la matriz con números
        for (int i = 0; i < 3; i++) { // Recorremos las filas
            for (int j = 0; j < 3; j++) { // Recorremos las columnas
                matriz[i][j] = i + j; // Asignar un valor (por ejemplo, suma de los índices)
            }
        }

        // Imprimir la matriz
        System.out.println("La matriz es:");
        for (int i = 0; i < 3; i++) { // Recorremos las filas
            for (int j = 0; j < 3; j++) { // Recorremos las columnas
                System.out.print(matriz[i][j] + " "); // Imprimir cada elemento
            }
            System.out.println(); // Salto de línea al final de cada fila
        }
    }
}
