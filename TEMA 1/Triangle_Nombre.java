import java.util.Scanner;

public class Triangle_Nombre {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el numero ");
        int rows = scanner.nextInt();

        for (int i = 1; i <= rows; i++) { // rows es el limite hhasta donde finalice el ciclo 
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        scanner.close();
    }
}
