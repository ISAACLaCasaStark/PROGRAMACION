import java.util.Scanner;

public class if_Numeros_iguales {
	public static void main(String[] args) {

		Scanner lector = new Scanner(System.in);

		System.out.println("Introdduzca el primer número");
		double numero1 = lector.nextDouble();
		System.out.println("Introduzca el segundo número");
		double numero2 = lector.nextDouble();
		System.out.println("Introduzca el tercer número");
		double numero3 = lector.nextDouble();

			if ((numero1==numero2) && (numero2==numero3)) {
				System.out.println("Iguales");
			} 

			else if ((numero1 != numero2) && (numero1 != numero3) && (numero2 != numero3)) {
					System.out.println("Diferents");
				
			}
			

			else {
				System.out.println("Algunos numeros son iguales");
			}
	}
	

}