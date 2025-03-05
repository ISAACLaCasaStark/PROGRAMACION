import java.util.Scanner;

public class CalculArees {
	public static void main(String[] args) {

	Scanner lector = new Scanner(System.in);

		System.out.println("Qué figura quiere calcular?");
		System.out.println("¿Triangle, cercle, trapezi, rombe o paral-lelogram?");
		String figura = lector.nextLine();

		//String triangle = (altura*anchura/2);

		if (figura.equalsIgnoreCase("Triangle")) { // public double triangulo(double altura, double anchura)
			System.out.println("Introdueix la altura del triangle");
			double altura = lector.nextDouble();
			System.out.println("Introdueix la anchura del triangle");
			double anchura = lector.nextDouble();
            double resultado = triangulo(altura, anchura);
            System.out.println("El area del triangle es:" + resultado);
			//System.out.println("El area del triangle es:" + (altura*anchura/2));
		}

		else if (figura.equalsIgnoreCase("cercle")) {
			System.out.println("Introduzca el radio del circulo");
			double radio = lector.nextDouble();
			//double area = Math.PI * Math.pow(radio, 2);
			double resultado = cercle(radio);
			System.out.println("El area del cercle es:" + resultado);

		}

		else if (figura.equalsIgnoreCase("trapezi")) {
			System.out.println("Introduzca la base mayor");
			double base_mayor = lector.nextDouble();
			System.out.println("Introduzca la base menor");
			double base_menor = lector.nextDouble();
			System.out.println("Introduzca la altura");
			double altura = lector.nextDouble();
			double resultado = trapezi((base_mayor + base_menor) * altura/2);
			System.out.println("El area del trapezi es:" + resultado);
		}

		else if (figura.equalsIgnoreCase("rombe")) {
			System.out.println("Introduzca diagonal mayor");
			double diagonal_mayor = lector.nextDouble();
			System.out.println("Introduzca diagonal menor");
			double diagonal_menor =lector.nextDouble();
			double resultado = rombe((diagonal_mayor*diagonal_menor)/2);
			System.out.println("El area del rombo es:" + resultado);
		}


		else if (figura.equalsIgnoreCase("paralelogram")) {
			System.out.println("Introduzca la altura");
			double altura = lector.nextDouble();
			System.out.println("Introduzca la base");
			double base = lector.nextDouble();
			double resultado = (altura*base);
			System.out.println("El area del paral-lelogram es:" + resultado);
		}


			else {
			System.out.println("ERROR, paraula no reconeguda");
			}


	}
    public static double triangulo(double altura, double anchura){
        double res = altura*anchura/2;
        return res;
    }

	public static double cercle(double radio){
        double res = Math.PI * Math.pow(radio, 2);
        return res;
    }

	public static double trapezi(double base_mayor, double base_menor, double altura ){
        double res =((base_mayor + base_menor) * altura/2);
        return res;
    }

	public static double rombe(double diagonal_mayor, double diagonal_menor){
        double res = ((diagonal_mayor*diagonal_menor)/2);
        return res;
    }

	public static double paralelogram(double altura, double base){
        double res = altura*base;
        return res;
    }

}