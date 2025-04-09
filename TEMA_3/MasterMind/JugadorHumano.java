package MasterMind;

import java.util.Scanner;

public class JugadorHumano extends Jugador {
    String abecedario = "abcdefghijklmnopqrstuvwxyz";
    Scanner sc;

    public JugadorHumano(int tamaño, Scanner sc) {
        super(tamaño);
        this.sc = sc;
    }

    @Override
    public String hacerIntento() {
        String intento;
        boolean valido = false;
        do {
            System.out.print("Dime " + tamañoCodigo + " letras: ");
            intento = sc.nextLine();
            valido = validarIntento(intento);
            if (!valido) {
                System.out.println("No es válido!");
            }
        } while (!valido);
        return intento;
    }

    private boolean validarIntento(String intento) {
        if (intento.length() != tamañoCodigo) {
            return false;
        }
        for (int i = 0; i < intento.length(); i++) {
            if (abecedario.indexOf(intento.charAt(i)) == -1) {
                return false;
            }
        }
        return true;
    }
}