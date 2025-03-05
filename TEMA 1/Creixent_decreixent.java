import java.util.Scanner;

public class Creixent_decreixent {
	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);

		double numero1, numero2, numero3;
		System.out.println("Introduzca el primer digito");
		numero1=lector.nextDouble();
		System.out.println("Introduzca el segundo digito");
		numero2=lector.nextDouble();
		System.out.println("Introduzca el tercer digito");
		numero3=lector.nextDouble();


		if ((numero2>numero1) && (numero3>numero2)) {
			System.out.println("Creixent");
			}

		else if ((numero2<numero1) && (numero3<numero2)) {
			System.out.println("Decreixent");
			}

		else {
			System.out.println("Ni Creixent, ni Decreixent.");
			}

		lector.close();
	}
	
} 