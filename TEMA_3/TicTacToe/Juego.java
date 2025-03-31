package TicTacToe;

import AEA3.TicTacToe.Tauler;

import java.util.Scanner;

public class Juego {
    private Tauler tauler;
    private char jugadorActual;
    private boolean guanyador;
    private Scanner scanner;

    public Juego (){ 
        tauler = new Tauler();
        jugadorActual = 'X';
        guanyador = false;
        scanner = new Scanner (System.in);
    }

    public void inicio() {
        
    }
}
