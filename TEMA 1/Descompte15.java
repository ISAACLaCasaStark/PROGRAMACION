import java.util.Scanner;

public class Descompte15 {
	public static void main(String[] args) {

	Scanner lector = new Scanner(System.in);

	 System.out.println("Introduzca el precio My Rey");
	 float compra = lector.nextFloat();
	 float precio_min = 95;
	 float descuento = 0.15f*compra;

		if (compra>=0) {

			if (compra>=precio_min) {
			 float precio_descuento = (compra - descuento);
			 System.out.println("Se ha aplicado el descuento mi rey, ahora vale:" + (precio_descuento) + "euros");
			}

			else if (compra<precio_min) {
			 System.out.println("No se ha podido aplicar el descueto: " + (compra) + "euros");
			}
		}

				else {
				System.out.println("ERROR el precio no puede ser negativo");
				}

	}
}