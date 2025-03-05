import java.util.Scanner;

class Multiplicaciondinamica {
	public static void main(String[] args) {
		Scanner lector = new Scanner (System.in);
		System.out.println("Agrega dos numeros");

		
		double primernumero=lector.nextDouble();
		double segundonumero=lector.nextDouble();
		double resultat=primernumero*segundonumero;
		System.out.println(resultat);
	}
}