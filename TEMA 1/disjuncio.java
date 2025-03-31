import java.util.Scanner;

public class disjuncio {
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);

        String linea1 = "A\tB\t(A || B)\n";
        String linea2 = "false\tfalse\tfalse\n";
        String linea3 = "true\tfalse\ttrue\n";
        String linea4 = "false\ttrue\ttrue\n";
        String linea5 = "true\ttrue\ttrue\n";

        System.out.println(linea1 + linea2 + linea3 + linea4 + linea5);

    }
}    