import java.util.Scanner;

public class ExamenBuscarVector {
    public static void main(String[] args) {
        
        int[] numeros = {5, 10, 15, 20, 25, 30, 35, 40};
        
        
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.println("Papi Ingrese un número para buscar en el vector:");
        int valorBuscado = scanner.nextInt();
        
        
        boolean encontrado = false;
        
        
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == valorBuscado) {
                System.out.println("El número " + valorBuscado + " se encuentra en la posición " + i);
                encontrado = true;
                break;
            }
        }
        
        if (!encontrado) {
            System.out.println("El número " + valorBuscado + " no se encuentra en el vector.");
        }
        
    }
}
