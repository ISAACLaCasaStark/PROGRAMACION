import java.util.Scanner;

public class Numero_Mayor {
	public static void main(String[] args) {
		Scanner lector = new Scanner (System.in);

int numeros[] = {12, 3, 45, -3, 65, -5, 88, 99, 2, 23, 54, 33, 27, 53, 96, 0};
int numMax = 0;
int numMin = 0;

    for(int i = 0; i < numeros.length-1; i ++)
    {
      if( numMin > numeros[i] || numMin == 0)
      {
        numMin = numeros[i];
      }
      if(numMax < numeros[i])
      {
        numMax = numeros[i];
      }

    }
    System.out.println("El numero mas grande es:"+numMax);
    System.out.println("El numero mas pequeño es:"+numMin);
    }
}