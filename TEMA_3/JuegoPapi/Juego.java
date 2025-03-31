package JuegoPapi;

import java.util.Scanner;

public class Juego {
    private Tauler tauler; 
    private char jugadorActual; 

    public Juego(Tauler tauler) {
        this.tauler = tauler; // Aqui inicio el tablero
        this.jugadorActual = 'X'; // El jugador siempre empezará con la X
    }

    public void jugar() {
        Scanner scanner = new Scanner(System.in); // Scanner para que el jugador pueda ingresar cositas
        boolean juegoTerminado = false; // La primera condicional

        while (!juegoTerminado) {
            tauler.mostrarTablero();

            // Le pregunto al jugador cómo la quiere de grande, "La tabla evidentemente"
            System.out.println("Turno del jugador " + jugadorActual);
            System.out.print("Fila (0-" + (tauler.getTamaño() - 1) + "): ");
            int fila = scanner.nextInt();
            System.out.print("Columna (0-" + (tauler.getTamaño() - 1) + "): ");
            int columna = scanner.nextInt();

            if (tauler.marcarCasilla(fila, columna, jugadorActual)) {
                if (tauler.hayGanador(jugadorActual)) {
                    tauler.mostrarTablero();
                    System.out.println("¡El jugador " + jugadorActual + " ha ganado, felicidades mi rey!");
                    juegoTerminado = true; // Aquí ya termina el GAME
                }
               
                else if (tauler.tableroLleno()) {//Si está lleno también se termina el juego, porque ya no hay espacios para rellenar
                    tauler.mostrarTablero();
                    System.out.println("¡Empate!");
                    juegoTerminado = true; // Termina el juego
                }
                
                else { // Aquí se cambia el jugador 
                    if (jugadorActual == 'X') {
                        jugadorActual = 'O';
                    } else {
                        jugadorActual = 'X';
                    }
                }
            } else {// Si introduzco un valor que justo ya está pillado imprimo por pantalla lo siguiente
                System.out.println("Casilla ocupada o inválida. Intenta de nuevo mi rey.");
            }
        }

    }
}