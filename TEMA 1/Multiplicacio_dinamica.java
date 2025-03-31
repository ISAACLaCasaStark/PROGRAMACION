import java.util.Scanner;

public class Multiplicacio_dinamica {
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);

        System.out.println ("Introduzca el primer numero");
        int numero1=lector.nextInt();
        System.out.println ("Introduzca el segundo numero");
        int numero2=lector.nextInt();

        System.out.println ("Resultado:" + (numero1*numero2));

    
    }
}


