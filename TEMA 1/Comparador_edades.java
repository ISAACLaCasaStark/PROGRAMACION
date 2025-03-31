import java.util.Scanner;

public class Comparador_edades {
	public static void main(String[] args) {
		Scanner lector = new Scanner (System.in);

int edades[] = {20, 22, 18, 35, 48, 26, 87, 70};
string []cadenas;
int edadMax = 0;
int edadMin = 0;
int dif = 0;  
    for(int i = 0; i < edades.length-1; i ++)
    {
      if( edadMin > edades[i] || edadMin == 0)
      {
        edadMin = edades[i];
      }
      if(edadMax < edades[i])
      {
        edadMax = edades[i];
      }

    }
    dif = edadMax - edadMin;
    System.out.println("La edad mas grande es:"+edadMax);
    System.out.println("La edad mas pequeña es:"+edadMin);
    System.out.println("La diferencia de edad es de:"+dif+" años");
    }
}