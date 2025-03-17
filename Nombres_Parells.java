import java.util.Scanner;

public class Nombres_Parells {
	public static void main(String[] args) {
		Scanner lector = new Scanner (System.in);


        int numerosPares[] = new int[51];
        int j = 0;

        for(int i = 0; i <= 100; i ++)
        {
            if(i % 2 == 0)
            {
                numerosPares[ j ] = i;
                j++;
            }

        }
        for(int numeros : numerosPares)
        {
            System.out.println(numeros + "\n");
        }
    }
}