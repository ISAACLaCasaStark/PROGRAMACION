import java.util.Scanner;

public class Multiplicacion3Numeros
{
	public static void main(String[] args) 
	{
		Scanner lector = new Scanner (System.in);

		System.out.println("coloca el primer numero");
		double numero1= lector.nextDouble();
		System.out.println("coloca el segundo numero");
		double numero2= lector.nextDouble();
		System.out.println("coloca el tercer numero");
		double numero3= lector.nextDouble();

		double resultado = numero1*numero2*numero3;
        System.out.println("Y el resultado es: " + resultado + " profe no me pongas mala nota porfis");
		
		}

	}

