import java.util.Arrays;
import java.util.Scanner;

public class Sort_Numero_Mayor {
	public static void main(String[] args) {
		Scanner lector = new Scanner (System.in);

int numeros[] = {12, 3, 45, -3, 65, -5, 88, 99, 2, 23, 54, 33, 27, 53, 96, 0};
Arrays.sort(numeros);
System.out.println("Arrays ordenado" + Arrays.toString(numeros));

   
    }
}