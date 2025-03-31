import java.util.Scanner;

public class NumerosPares {
	public static void main(String[] args) {

        int[][] numerosPares = new int[10][10];
        System.out.println("Los siguientes numeros pares son los siguientes:");
        for(int i = 0; i < numerosPares.length; i ++){
            for (int j = 0; j < numerosPares[i].length; j++){

                numerosPares[i][j] = i%2;
                System.out.print(numerosPares[i][j]);
            }
            System.out.println();

        }
    }
}