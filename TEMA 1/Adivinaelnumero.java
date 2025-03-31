import java.util.Scanner;
import java.util.Random;

public class Adivinaelnumero {
    public static void main1(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        
        int nombreSecret = random.nextInt(11); // Número entre 0 i 10 /variable "random"
        int maxIntents = 5; // Máximo número de intentos
        int intentsRestants = maxIntents;
        int nombreUsuari;
        
        System.out.println("Comienza el juego PAPI.");
        System.out.println("Tenes " + maxIntents + " intentos para adivinar el número entre 0 y 10.");

     
        while (intentsRestants > 0) { // bocle
            System.out.print("Ingresa un número: ");
            nombreUsuari = scanner.nextInt(); 

            intentsRestants--; // "--"" se descontará con cada imteracción un intento
            
            if (nombreUsuari == nombreSecret) {
                System.out.println("Enhorabona! Has guanyat!");
                break; // Aqui si acierto se para el juego e imprimirá ("Enhorabona! Has guanyat!")
            } else {

                if (intentsRestants > 0) {
                    System.out.println("Has fallado. Torna a intentar-ho.");

                } else {
                    System.out.println("Has perdido tio y mira que era facil. El número secreto era: " + nombreSecret); // variable random
                }
            }
        }

        scanner.close();
    }
}
