import java.util.Scanner;

public class Multiplicacion_de_3_numeros {
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);

        System.out.println("Introduzca el primer numero a multiplicar");
        int numero1 = lector.nextInt();
        System.out.println("Introduzca el sugundo numero");
        int numero2 = lector.nextInt();
        System.out.println("Introduzca el tercer numero");
        int numero3 = lector.nextInt();

        System.out.println("El resultado es:" + (numero1*numero2*numero3));

    }
}
