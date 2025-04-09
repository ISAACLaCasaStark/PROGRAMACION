package MasterMind;

public abstract class Jugador {
    int tamañoCodigo;

    public Jugador(int tamaño) {
        this.tamañoCodigo = tamaño;
    }

    public abstract String hacerIntento();
}