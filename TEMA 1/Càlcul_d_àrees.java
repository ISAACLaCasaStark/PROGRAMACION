import java.util.Scanner;

public class Càlcul_d_àrees {//PRUEBA ISAAC
	public static void main(String[] args) {
	Scanner lector = new Scanner (System.in);

		System.out.println("Introduzca el area del triangle, circulo, trapezi, rombe o paral.lelogram ");
		String figura = lector.next();
		double Area_Total = 0;
		double altura= 0;
		double anchura= 0;

		if (figura.equalsIgnoreCase("triangle")){

			System.out.println("Introduzca la anchura de un triangle: ");
			anchura = lector.nextDouble();
			System.out.println("Introduzca la altura de un triangle: ");
			altura = lector.nextDouble();
			System.out.println("El Area de triangulo es: " + anchura*altura/2);



		} else if (figura.equalsIgnoreCase("circulo")){

			System.out.println("Introduzca el radio : ");
		double radio = lector.nextDouble();
		System.out.println("El Area de circulo es: " + (3.1416) *(radio*radio));
		
        
        } else if (figura.equalsIgnoreCase("trapezi")){

			System.out.println("Introduzca la base mayor de un trapezi: ");
		anchura = lector.nextDouble();
		System.out.println("Introduzca la base menor de un trapezi: ");
		double bmenor = lector.nextDouble();
		System.out.println("Introduzca la altura de un trapezi: ");
		altura = lector.nextDouble();
		double resultado_trapezi = anchura;
		System.out.println("El Area de trapezi es:" + ((anchura+bmenor)*altura) /2);
		
		
        
        } else if (figura.equalsIgnoreCase("rombe")){

			System.out.println("Introduzca la anchura de un rombe: ");
		anchura = lector.nextDouble();
		System.out.println("Introduzca la altura de un rombe: ");
		altura = lector.nextDouble();
		System.out.println("El Area de rombe es: " + anchura*altura/2);
		
        
        } else if (figura.equalsIgnoreCase("paral.lelogram")){

			System.out.println("Introduzca la anchura de un paral.lelogram: ");
		anchura = lector.nextDouble();
		System.out.println("Introduzca la altura de un paral.lelogram: ");
		altura = lector.nextDouble();
		System.out.println("El Area de paral.lelogram es: " + anchura*altura/2);
		

		} else System.out.println("error esta palabra no pertenece al grupo de figuras");


	}


}