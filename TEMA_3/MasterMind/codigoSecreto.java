package MasterMind;

import java.util.Random;

public class codigoSecreto {
    private String letras = "abcdefghijklmnopqrstuvwxyz";
    private int tamaño = 3;
    private Random rand = new Random();

    public String generarCodigo() {
        String codigo = "";
        for (int i = 0; i < tamaño; i++) {
            codigo = codigo + generarLetra();
        }
        return codigo;
    }

    private char generarLetra() {
        int num = rand.nextInt(letras.length());
        return letras.charAt(num);
    }
}