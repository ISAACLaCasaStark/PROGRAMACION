import java.util.Scanner;

public class MULTIPLES_3 {
    public static void main(String[] args) {
    
        Scanner lector = new Scanner(System.in);

        
        System.out.println("HASTA QUÉ MÚLTIPLE DEL TRES QUIERES SUMAR?");
        int limite = lector.nextInt(); //  limite del usuario

        int sumador = 0; //variable que acumula la suma

        for (int i = 0; i <= limite; i++) {
            if (i % 3 == 0) {
                System.out.println("Añadiendo " + i);
                sumador += i;
            }
        }

        System.out.println("Resultado final: " + sumador);

        // Cerrar el lector
        lector.close();
    }
}
