import java.util.ArrayList;

public class Tarea1 {
    public static void main(String[] args) {
        int[][] mat = new int[5][5];
        int suma = 0;
        int mayor = -99999;
        int diagonal1 = 0;
        int diagonal2 = 0;
        int filaUltima = 0;
        int repiteMayor = 0;
        ArrayList<Integer> primos = new ArrayList<>();
        ArrayList<Integer> pares = new ArrayList<>();

        // Crear la matriz y hacer cálculos
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                mat[i][j] = (int) (Math.random() * 100); 
                suma = suma + mat[i][j];

                // Verificar si es el mayor número
                if (mat[i][j] > mayor) {
                    mayor = mat[i][j];
                    repiteMayor = 1;
                } else if (mat[i][j] == mayor) {
                    repiteMayor = repiteMayor + 1;
                }

                // Revisar si es primo
                if (checarPrimo(mat[i][j]) == true) {
                    primos.add(mat[i][j]);
                }

                // Revisar si es par
                if (mat[i][j] % 2 == 0) {
                    pares.add(mat[i][j]);
                }

                // Diagonal principal
                if (i == j) {
                    diagonal1 = diagonal1 + mat[i][j];
                }

                // Diagonal secundaria
                if (i + j == 4) {
                    diagonal2 = diagonal2 + mat[i][j];
                }

                // Última fila
                if (i == 4) {
                    filaUltima = filaUltima + mat[i][j];
                }
            }
        }

        System.out.println("La matriz es:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Suma total: " + suma);
        System.out.println("Número mayor: " + mayor);
        System.out.println("Veces que aparece el mayor: " + repiteMayor);
        System.out.println("Números primos: " + primos);
        System.out.println("Números pares: " + pares);
        System.out.println("Suma de la diagonal principal: " + diagonal1);
        System.out.println("Suma de la diagonal secundaria: " + diagonal2);
        System.out.println("Suma de la última fila: " + filaUltima);
        System.out.println("Promedio de todos los números: " + (suma / 25.0));
    }

    // Función para saber si un número es primo
    public static boolean checarPrimo(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
