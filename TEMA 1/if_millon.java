import java.util.Scanner;

public class if_millon {
	public static void main(String[] args) {
		Scanner lector = new Scanner (System.in);

		System.out.println("Introduzca un numero");
		int numero = lector.nextInt();

		if (numero >= 0){

			if (numero==0) {
			System.out.println("Resultado: es zero");

			}

			else if (numero>0 && numero <=10) {
				System.out.println("Positiu baix"); 

			}

			else if (numero >=1000000) {
				System.out.println("Positiu gran");

			}

			else {
				System.out.println("Positiu");
			}
		}

			if (numero<0){

				if (numero >= -10) {
				System.out.println("Negativo petit");

				}

				else if (numero <= -1000000) {
				System.out.println("Negatiu gran");
				}

				else {
				System.out.println("Negativo");
				}
			}
		lector.close();
		
	}
}

