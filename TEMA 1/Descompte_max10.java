import java.util.Scanner;

public class Descompte_max10 {
	public static void main(String[] args) {

	Scanner lector = new Scanner(System.in);

		System.out.println("Introduzca el precio del producto");
		double compra = lector.nextDouble();
		double compra_min = 100;
		double descompte_min = 0.08*compra;
		double descompte_max = 10;

		if (compra>0) {

			if (compra<compra_min) {
				System.out.println("No se ha aplicado el descuento, Precio final: " + (compra) + " euros" );
			}

			else if (descompte_min>=descompte_max) {
				System.out.println("Se ha agregado el descuento maximo, el precio final es" + (compra-descompte_max) + " euros");

			}

			else if (compra>=compra_min) {
				System.out.println("Se ha añadido descuento, el precio final es:" + (compra-descompte_min) + " euros");

			}

			
		}


		else {
			System.out.println("ERROR, el precio no puede ser negativo; Listillo de mierda");
		}

		lector.close();

	}
}