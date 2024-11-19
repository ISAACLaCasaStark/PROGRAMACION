import java.util.Scanner;

public class Descompte8 {
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);

        System.out.println("Introduzca el precio PAPI");
        float compra = lector.nextFloat();
        float compra_min = 100;
        float descuento = 0.08f*compra;
       

        
        if (compra>=0) {

         if (compra>=compra_min) {
            float precio_final = compra-descuento;
            System.out.println("Se ha hecho el descuento, precio final:" + (precio_final) + "euros");
         }

         else if (compra<compra_min) {
            System.out.println(" No se ha hecho el descuento, precio final" + (compra) + "euros");
         }

        }

          else {
            System.out.println("ERROR, el valor no puede ser negativo");
          } 
        
    }
}