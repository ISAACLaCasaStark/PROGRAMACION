import java.util.Scanner;

public class Penalitzacio_2euros {
	public static void main(String[] args) {

		Scanner lector = new Scanner(System.in);

		System.out.println("Introduzca el precio mi rey");
		int compra = lector.nextInt();
		int compra_min = 30;
		int por_rata = 2;

			if (compra>=0) {

				if (compra<compra_min) {
					int penalizacion = (compra-por_rata);
					System.out.println("Has sido penalizado por gastar tan poco, -2 euros: " + (penalizacion) + " euros");
				}

				else if (compra>=compra_min) {
					System.out.println("Precio final: " + (compra) + " euros");
				}	

				
			}
					else {
						System.out.println("ERROR el valor no puede ser negativo");
					}
			

	}
	


}