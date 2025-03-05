import java.util.Scanner;

public class Descomptes {
 public static void main (String[] args) {
 	Scanner input= new Scanner(System.in);

 	double descuento= 0.15;
 	System.out.println("Agrega el precio del producto");
 	double precio_Original = input.nextDouble(); // precio pendiente de poner profe

 	if(precio_Original>=95){
 		precio_Original -= (precio_Original * descuento);
 		System.out.println("El precio ha sido descontado y ahora equivale a :" + precio_Original + " euros");

 	}
 	else
 	{
 		double restante = 95 - precio_Original;
 		System.out.println("No has gastado lo suficiente, para obtener el descuento te faltan : " + restante + " euros");
 	}

 }
	
}