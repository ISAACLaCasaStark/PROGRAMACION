import java.util.Scanner;

public class ExamenSumaVectores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Papi ingrese la longitud de los vectores: ");
        int longitud = scanner.nextInt();

        
        int[] vector1 = new int[longitud];
        int[] vector2 = new int[longitud];
        int[] suma = new int[longitud];

        
        System.out.println("Ingrese los elementos del primer vector:");
        for (int i = 0; i < longitud; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vector1[i] = scanner.nextInt();
        }

        System.out.println("Ingrese los elementos del segundo vector:");
        for (int i = 0; i < longitud; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vector2[i] = scanner.nextInt();
        }

        
        for (int i = 0; i < longitud; i++) {
            suma[i] = vector1[i] + vector2[i];
        }

        
        System.out.println("El vector resultante de la suma es:");
        for (int i = 0; i < longitud; i++) {
            System.out.println("Elemento " + (i + 1) + ": " + suma[i]);
        }

        
    }
}
