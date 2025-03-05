import java.util.Scanner;

public class Calcul_de_Areas {
	public static void main(String[] args) {

	Scanner lector = new Scanner(System.in);

		System.out.println("Qué figura quiere calcular?");
		System.out.println("¿Triangle, cercle, trapezi, rombe o paral-lelogram?");
		String figura = lector.nextLine();

		

		if (figura.equalsIgnoreCase("Triangle")) {
			System.out.println("Introdueix la altura del triangle");
			double altura = lector.nextDouble();
			System.out.println("Introdueix la anchura del triangle");
			double anchura = lector.nextDouble();
			System.out.println("El area del triangle es:" + (altura*anchura/2));
		}

		else if (figura.equalsIgnoreCase("cercle")) {
			System.out.println("Introduzca el radio del circulo");
			double radio = lector.nextDouble();
			double area = Math.PI * Math.pow(radio, 2);
			System.out.println("El area del cercle es:" + area);

		}

		else if (figura.equalsIgnoreCase("trapezi")) {
			System.out.println("Introduzca la base mayor");
			double base_mayor = lector.nextDouble();
			System.out.println("Introduzca la base menor");
			double base_menor = lector.nextDouble();
			System.out.println("Introduzca la altura");
			double altura = lector.nextDouble();
			System.out.println("El area del trapezi es:" + ((base_mayor + base_menor) * (altura)/2));
		}

		else if (figura.equalsIgnoreCase("rombe")) {
			System.out.println("Introduzca diagonal mayor");
			double diagonal_mayor = lector.nextDouble();
			System.out.println("Introduzca diagonal menor");
			double diagonal_menor =lector.nextDouble();
			System.out.println("El area del rombo es:" + ((diagonal_mayor*diagonal_menor)/2));
		}


		else if (figura.equalsIgnoreCase("paral-lelogram")) {
			System.out.println("Introduzca la altura");
			double altura = lector.nextDouble();
			System.out.println("Introduzca la base");
			double base = lector.nextDouble();
			System.out.println("El area del paral-lelogram es:" + (altura*base));
		}


			else {
			System.out.println("ERROR, paraula no reconeguda");
			}


	}
}