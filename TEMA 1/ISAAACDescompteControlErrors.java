import java.util.Scanner;

public class DescompteControlErrors {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        double descuento = 0.08;                   /// aqui estan las tres variables principales///
        double compra_Minima = 100;
        double descuento_Maximo = 10; //10 euros
        double compra_Maxima = 200;

        System.out.println ("Agrega el precio del producto");
        double precio_Original = lector.nextDouble ();

        if (precio_Original <0) {System.out.println ("Error: el precio no puede ser negativo");}


         else if (precio_Original >= compra_Maxima) {
            double Aplicacion_Del_Descuento = (descuento_Maximo*precio_Original);
            System.out.println ("Descuento Maximo Aplicado: " + (descuento_Maximo) + (" Euros"));
        }


        else if (precio_Original >= compra_Minima) {
            double Aplicacion_Del_Descuento = (descuento*precio_Original);
            System.out.println ("Descuento Aplicado: " + (descuento*precio_Original) + (" Euros"));
        }




    }    
}
