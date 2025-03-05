import java.util.Scanner;

public class calculadorabasica {

    public static void main(String[] args) {
        // Crear un objeto Scanner para leer entradas desde la consola
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese el primer número
        System.out.print("Ingresa el primer número: ");
        double num1 = scanner.nextDouble();

        // Solicitar al usuario que ingrese el operador
        System.out.print("Ingresa la operación (+, -, *, /): ");
        char operador = scanner.next().charAt(0);

        // Solicitar al usuario que ingrese el segundo número
        System.out.print("Ingresa el segundo número: ");
        double num2 = scanner.nextDouble();

        double resultado = 0;

        // Realizar la operación según el operador ingresado
        switch (operador) {
            case '+':
                resultado = num1 + num2;
                break;
            case '-':
                resultado = num1 - num2;
                break;
            case '*':
                resultado = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    System.out.println("Error: No se puede dividir entre cero.");
                    return; // Termina la ejecución si hay un error
                }
                break;
            default:
                System.out.println("Operación no válida.");
                return; // Termina la ejecución si la operación no es válida
        }

        // Mostrar el resultado
        System.out.println("El resultado es: " + resultado);

        // Cerrar el scanner para liberar recursos
        scanner.close();
    }
}