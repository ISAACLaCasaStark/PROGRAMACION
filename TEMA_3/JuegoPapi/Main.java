package JuegoPapi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Scanner para que el usuario pueda ingresar cositas

        System.out.print("¿De qué tamaño la quieres (mal pensao) la taula, la taula? (por ejemplo, 3 para 3x3, 4 para 4x4, etc.): ");
        int tamaño = scanner.nextInt();

        
        if (tamaño < 3) {// Aquí si el jugador pone un 2 hacia abajo, por defecto jugará con el tablero 3x3
            System.out.println("El tamaño mínimo es 3. Se usará un tablero de 3x3.");
            tamaño = 3;
        }

        
        Tauler tablero = new Tauler(tamaño);// llamamos tablero más el tamaño 

        Juego juego = new Juego(tablero);// llamamos a juego 

        juego.jugar();// Arrancamos papi

    }
}