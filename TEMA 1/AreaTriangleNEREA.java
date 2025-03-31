import java.util.Scanner;

class AreaTriangle {
	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		System.out.println("Quin es l'àrea del triangle?");
		System.out.println("Escriu el valor de la base:");
		double baseTriangle = lector.nextDouble();
		System.out.println("Escriu el valor de l'altura:");
		double alturaTriangle = lector.nextDouble();
		double areaTriangle = baseTriangle * alturaTriangle / 2;
		System.out.println("L'àrea del triangle es:" + areaTriangle + ".");

		int a = 2; //Numeros enteros
		float c = 2f; //Numeros decimales
		double b = 5.5; //Numeros decimales mas largos que los float 

		long long d = 2.25; //Numeros decimales mas largos que los double
		String e; //Cadena para escribir una frase
		String frase = "La division de a dividido entre b da de residuo igual a 0";
		char f = 'a'; //Letra
		int [] array = new [] { 3, 2,1,5}; // Album de numeros
		boolean esVerdad; // valores = "true" o "false"

		esVerdad = a % b == 0; // Le doy el valor al booleano de si a modulo de b da de resto 0

		if(esVerdad) 
		{
			e = "es divisible";
			System.out.println(e);
			int a = lector;
		}
		else
		{
			e = "no es divisible";
			System.out.println(e);
		}
	}
}