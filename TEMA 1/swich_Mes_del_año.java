import java.util.Scanner;

public class swich_Mes_del_año {
	public static void main(String[] args) {
		Scanner lector = new Scanner (System.in);

		System.out.println("Escoja un numero del 1 al 12 para saber cuántos días tiene ese mes.");
		int mes = lector.nextInt();

		switch (mes) {
			case 2:
			System.out.println("El mes que ha elejido tiene 28 0 29 días");
			break;

			case 4:
			case 6:
			case 9:
			case 11: 
			System.out.println("El mes que ha elejido tiene 30 días");
			break;

			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
			System.out.println("El mes que ha elejido tiene 31 días");
			break;

		    default:
		    	System.out.println("ERROR, introduzca un numero del 1 al 12.");
		}

		lector.close();


	}

}