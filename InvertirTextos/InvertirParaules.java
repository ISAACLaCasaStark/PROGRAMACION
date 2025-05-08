package InvertirTextos;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class InvertirParaules {

    public static void main(String[] args) {

        try {
            File arxiu = new File("InvertirTextos/archivo.txt");
            Scanner sc = new Scanner(arxiu);
            File sortida = new File("arxiu_invertit.txt");
            FileWriter fw = new FileWriter(sortida, false);

            while (sc.hasNextLine()) {
                String liniaActual = sc.nextLine();
                String liniaInvertida = "";

                for (int i = liniaActual.length(); i > 0; i--) {
                    liniaInvertida = liniaInvertida + liniaActual.charAt(i - 1);
                    fw.write(liniaActual.charAt(i - 1));
                }
                fw.write("\n");
                System.out.println(liniaInvertida);
            }

            sc.close();
            fw.close();
            System.out.println("Se ha invertido correctamente el texto.");

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}
