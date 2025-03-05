package TicTacToe;
public class MainTauler {
    public static void main(String[] args) {

        Tauler t = new Tauler();

        t.MostrarTauler();
        t.marcarCasella(0, 2, 'X');
        boolean guanyat = t.haGuanyat('X');
        System.out.println("Ha guanyat X? " + guanyat);
        t.MostrarTauler();
        t.marcarCasella(1, 1, 'O');
        guanyat = t.haGuanyat('O');
        System.out.println("Ha guanyat O? " + guanyat);
        t.MostrarTauler();
        boolean taulerPle = t.taulerPle();
        System.out.println("Està ple? "+ taulerPle);
        t.marcarCasella(0, 0, 'X');
        t.marcarCasella(0, 1, 'O');

        t.marcarCasella(1, 2, 'X');
        t.marcarCasella(2, 0, 'O');
        t.marcarCasella(2, 1, 'X');

        t.marcarCasella(2, 2, 'O');
        t.marcarCasella(1, 0, 'X');
        t.MostrarTauler();
        taulerPle = t.taulerPle();
        System.out.println("Està ple? "+ taulerPle);


    }
}