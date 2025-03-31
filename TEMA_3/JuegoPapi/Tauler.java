package JuegoPapi;

public class Tauler {
    private char[][] tablero; // Aquí la matríz
    private int tamaño; // Variable para el tamaño

    public Tauler(int tamaño) {
        this.tamaño = tamaño; //función guardar
        tablero = new char[tamaño][tamaño]; 

        
        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {
                tablero[i][j] = '-';// espacios vacios igual a "-"
            }
        }
    }

    public void mostrarTablero() {
        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {
                System.out.print(tablero[i][j] + " "); 
            }
            System.out.println(); // el "Ln" para que me quede bonito
        }
    }

    
    public boolean marcarCasilla(int fila, int columna, char jugador) {// Aquí creo las variables 
        if (fila >= 0 && fila < tamaño && columna >= 0 && columna < tamaño && tablero[fila][columna] == '-') {
            tablero[fila][columna] = jugador;
            return true; 
        }
        return false; // si me devuelve "false" es porque la casilla ya está llena o he introducido un valor raro
    }

    public boolean hayGanador(char jugador) {
        for (int i = 0; i < tamaño; i++) {
            boolean filaCompleta = true;
            for (int j = 0; j < tamaño; j++) {
                if (tablero[i][j] != jugador) {
                    filaCompleta = false;// Aqui gano
                    break;
                }
            }
            if (filaCompleta) {
                return true;
            }
        }

        for (int j = 0; j < tamaño; j++) {
            boolean columnaCompleta = true;
            for (int i = 0; i < tamaño; i++) {
                if (tablero[i][j] != jugador) {
                    columnaCompleta = false;
                    break;
                }
            }
            if (columnaCompleta) {
                return true; 
            }
        }

       
        boolean diagonalPrincipal = true;
        for (int i = 0; i < tamaño; i++) {
            if (tablero[i][i] != jugador) {// verifico diagonales 
                diagonalPrincipal = false;
                break;
            }
        }
        if (diagonalPrincipal) {
            return true; //
        }

    
        boolean diagonalSecundaria = true;
        for (int i = 0; i < tamaño; i++) {
            if (tablero[i][tamaño - 1 - i] != jugador) {
                diagonalSecundaria = false;
                break;
            }
        }
        if (diagonalSecundaria) {
            return true; 
        }

        return false;// si me devuelve "false" es porque no hay ganador
    }
    public boolean tableroLleno() {
        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {
                if (tablero[i][j] == '-') {
                    return false;
                }
            }
        }
        return true;
    }

    public int getTamaño() {
        return tamaño;
    }
}