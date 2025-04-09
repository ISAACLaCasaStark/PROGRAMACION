package MasterMind;

import java.util.Scanner;

public class MastermindGame {
    String codigoSecreto;
    Jugador jugador;

    public MastermindGame(Jugador jugador) {
        this.jugador = jugador;
        this.codigoSecreto = new codigoSecreto().generarCodigo();
    }

    public void empezarJuego() {
        boolean adivinado = false;
        while (!adivinado) {
            String intento = jugador.hacerIntento();
            Pista pista = new Pista();
            adivinado = pista.getFeedback(codigoSecreto, intento);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Jugador jugador = new JugadorHumano(3, sc);
        MastermindGame juego = new MastermindGame(jugador);
        juego.empezarJuego();
        sc.close();
    }
}