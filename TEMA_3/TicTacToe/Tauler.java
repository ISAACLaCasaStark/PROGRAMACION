package TicTacToe;
public class Tauler {

    private char [][] tauler;

    public  Tauler(){
        tauler = new char [3][3];
        InicialitzarTauler();
    }

    public void InicialitzarTauler(){
        for (int i = 0; i < 3; i ++){
            for (int j = 0; j < 3; j ++){
                tauler[i][j] = '-';
            }
        }
    }

    public void MostrarTauler(){
        for (char [] fila : tauler){
            for (char casilla : fila){
                System.out.print(casilla+" ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public boolean marcarCasella(int fila, int columna, char jugador) {
        if (tauler[fila][columna] == '-') {
            tauler[fila][columna] = jugador;
            return true;
        } else {
            System.out.println("Casella ocupada, tria una altra.");
            return false;
        }
    }

    public boolean haGuanyat(char jugador) {
        // Comprovar files i columnes
        for (int i = 0; i < 3; i++) {
            if ((tauler[i][0] == jugador && tauler[i][1] == jugador && tauler[i][2] == jugador) ||
                (tauler[0][i] == jugador && tauler[1][i] == jugador && tauler[2][i] == jugador)) { 
                return true;
            }
        }

        // Comprovar diagonals
        if ((tauler[0][0] == jugador && tauler[1][1] == jugador && tauler[2][2] == jugador) ||
            (tauler[0][2] == jugador && tauler[1][1] == jugador && tauler[2][0] == jugador)) {
            return true;
        }

        return false;
    }

    public boolean taulerPle() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tauler[i][j] == '-') {
                    return false;
                }
            }
        }
        return true;
    }


}