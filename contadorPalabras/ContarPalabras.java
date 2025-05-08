import java.io.*;
import java.util.*;

public class ContarPalabras {

    public static void main(String[] args) {
        
        String archivoLeer = "entrada.txt";
        String archivoEscribir = "sortida.txt";
        
        int totalPalabras = 0; // Aquí guardaremos el número de palabras
        
        try {
            BufferedReader reader = new BufferedReader(new FileReader(archivoLeer));
            
            BufferedWriter writer = new BufferedWriter(new FileWriter(archivoEscribir));
            
            String linea;
            
            while((linea = reader.readLine()) != null) {
    
                linea = linea.trim();
            
                if(!linea.equals("")) {
                   
                    String[] palabras = linea.split(" ");
                    
                   
                    totalPalabras += palabras.length;
                }
            }
            
            writer.write("Nombre total de paraules: " + totalPalabras);
            
            reader.close();
            writer.close();
            
            System.out.println("Todo salió bien!");
            System.out.println("Encontramos " + totalPalabras + " palabras.");
            
        } catch(FileNotFoundException e) {
            System.out.println("Error: No encontré el archivo " + archivoLeer);
            System.out.println("Pon el archivo en la misma carpeta que este programa.");
            
        } catch(IOException e) {
            System.out.println("Ocurrió un problema con los archivos:");
            System.out.println(e.getMessage());
        }
    }
}