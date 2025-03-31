import java.util.Scanner;

public class Taula_Multiplicar {
	public static void main(String[] args) {
		Scanner lector = new Scanner (System.in);

		System.out.println ("Elije una tabla de multiplicar del 1 al 10. ¿Qué tabla de multiplicar quieres?");
		int numero = lector.nextInt ();
		int i = 1;


		while (i <= 10) {
			System.out.println (numero + "x" + i + "=" + (numero*i));
			i++;

		}

		lector.close ();

	}


}



		





