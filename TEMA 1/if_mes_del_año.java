import java.util.Scanner;

public class if_mes_del_año {
	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);

		System.out.println("Introduzca un número del 1 al 12 para saber cuántos días tiene ese mes");
		int mes = lector.nextInt();

		if (mes==2) {
			System.out.println("Este mes tiene 28 o 29 días");
		}

		else if ((mes==4) || (mes==6) || (mes==9) || (mes==11)) {
		System.out.println("Este mes tiene 30 días");
		}

		else if ((mes==1) || (mes==3) || (mes==5)  || (mes==7) || (mes==8) || (mes==10) || (mes==12)) {
		System.out.println("Esta mes tiene 31 días");
		}

		else {
			System.out.println("Este numero no se corresponde a ningún mes");
		}


		lector.close();

	}
}