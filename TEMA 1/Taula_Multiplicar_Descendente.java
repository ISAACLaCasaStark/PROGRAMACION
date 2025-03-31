import java.util.Scanner;

public class Taula_Multiplicar_Descendente {
	public static void main(String[] args) {
		Scanner lector = new Scanner (System.in);


        
        System.out.println("Elije una tabla de multiplicar del 1 al 10. ¿Qué tabla de multiplicar quieres?");
        int numero = lector.nextInt(); 

        int i = 10; //Aqui ahora i vale 10 en vez que 1

       
        while (i >= 1) { 
            System.out.println(numero + " x " + i + " = " + (numero * i));
            i--; //Aqui descuento de uno en uno --
        }

        lector.close();  
    }
}
