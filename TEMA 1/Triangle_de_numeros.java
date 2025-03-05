import java.util.Scanner;

public class Triangle_de_numeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el numero hasta donde quieres acumular en secuencia de su valor entero ");
        int n = scanner.nextInt(); // primera variable con valor "X"
        
        for (int i = 1; i <= n; i++) { // bocle for inicio de la interación
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
        
        scanner.close();
    }
}

