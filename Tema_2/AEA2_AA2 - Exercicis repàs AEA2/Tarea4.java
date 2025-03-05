import java.util.Scanner;

public class Tarea4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir la longitud del vector
        System.out.println("Por favor, ingrese la longitud del vector:");
        int n = scanner.nextInt();

        // Verificar que la longitud sea válida
        if (n < 2) {
            System.out.println("El vector debe tener al menos 2 elementos.");
            return; // Salir del programa
        }

        // Crear el vector
        int[] vector = new int[n];

        // Llenar el vector
        System.out.println("Ingrese los elementos del vector:");
        for (int i = 0; i < n; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vector[i] = scanner.nextInt();
        }

        // Inicializar variables para menor y segundo menor
        int menor = Integer.MAX_VALUE;
        int segundoMenor = Integer.MAX_VALUE;

        // Buscar el elemento más pequeño
        for (int i = 0; i < n; i++) {
            if (vector[i] < menor) {
                menor = vector[i];
            }
        }

        // Buscar el segundo más pequeño
        for (int i = 0; i < n; i++) {
            if (vector[i] > menor && vector[i] < segundoMenor) {
                segundoMenor = vector[i];
            }
        }

        // Verificar si se encontró un segundo menor
        if (segundoMenor == Integer.MAX_VALUE) {
            System.out.println("No hay un segundo elemento más pequeño.");
        } else {
            System.out.println("El segundo elemento más pequeño es: " + segundoMenor);
        }

    }
}
