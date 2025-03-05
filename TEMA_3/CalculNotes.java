import java.util.Scanner;

public class CalculNotes {
    
    public static double calcularMinim(double[] notes) {// Aqui primero declaramos (nota min, max y promedio) las 3 8funciones que nos serviran abajo cuando el ususario haya introducido las 5 notas
        double min = notes[0];
        for (double nota : notes) {
            if (nota < min) {
                min = nota;
            }
        }
        return min;
    }

    public static double calcularMaxim(double[] notes) {
        double max = notes[0];
        for (double nota : notes) {
            if (nota > max) {
                max = nota;
            }
        }
        return max;
    }

    public static double calcularMitjana(double[] notes) {
        double suma = 0;
        for (double nota : notes) {
            suma += nota;
        }
        return suma / notes.length;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] notes = new double[5];//Array de 5 espacios porque son 5 notas que nos interesan

        
        System.out.println("Introdueix 5 notes:");//Aquí ya recien pedimos las 5 notas que el usuario va a introducir
        for (int i = 0; i < 5; i++) {
            System.out.print("Nota " + (i + 1) + ": ");
            notes[i] = scanner.nextDouble();
        }

        System.out.println("\nNota mínima: " + calcularMinim(notes));
        System.out.println("Nota màxima: " + calcularMaxim(notes));
        System.out.println("Nota mitjana: " + calcularMitjana(notes));

    }
}
