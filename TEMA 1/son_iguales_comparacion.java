import java.util.Scanner;

public class son_iguales_comparacion {
	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);


		char letra1, letra2;
		System.out.println("Introduzca el primer valor"); 
		letra1 = lector.next().charAt(0);
		System.out.println("Introduzca el segundo valor");
		letra2 = lector.next().charAt(0);

		if (letra1==letra2) {
			System.out.println("Són iguals");
		}

		else if (letra1>letra2) {
			System.out.println("El més gran és " + (letra1));
		}

		else if (letra1<letra2) {
			System.out.println("El més gran és " + (letra2));
		}

		else {
			System.out.println("Error, valores no compatibles");
		}

		lector.close();
	}
}