import java.util.Scanner;

public class SWITCH_sumar_restar_multiplicar_dividir {
	public static void main(String[] args) {
		Scanner lector = new Scanner (System.in);


		System.out.println("¿Qué quiere hacer?");
		System.out.println("Introduza el numero 1 si quiere sumar, 2 si quiere restar, 3 si quiere multiplicar o 4 si quiere dividir");
		int opcion = lector.nextInt();
		System.out.println("Usted ha elegido la opción: " + (opcion) );
		System.out.println("Introduce el primer valor");
		int valor1 = lector.nextInt();
		System.out.println("Introduce el segundo valor");
		int valor2 = lector.nextInt();


		switch (opcion) {
			case 1:
			System.out.println("Has escogido sumar, el resultado es:" + (valor1+valor2));
			break;

			case 2:
			System.out.println("Has escogido restar, el resultado es:" + (valor1-valor2));
			break;

			case 3:
			System.out.println("Has escogido multiplicar, el resultado es" + (valor1*valor2));
			break;

			case 4:
			System.out.println("Has escogido dividir, el resultado final es:" + (valor1/valor2));
			break;
		

			default:
				System.out.println("Opcion no reconocida, por favor elija una opcion del 1 al 4");
		}
			

		lector.close();
	}
}