import java.util.Scanner;

public class AreaTriangle  {//PRUEBA ISAAC
	public static void main(String[] args) {
		Scanner lector = new Scanner (System.in);
		System.out.println("Introduzca la anchura de un triangle: ");
		double anchura = lector.nextDouble();
		System.out.println("Introduzca la altura de un triangle: ");
		double altura = lector.nextDouble();
		System.out.println("El Area de triangulo es: " + anchura*altura/2);
	}
}