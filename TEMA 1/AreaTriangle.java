import java.util.Scanner;

public class AreaTriangle {
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);

        System.out.println("Introduzca la altura");
        double Altura=lector.nextDouble();
        System.out.println("Introduzca la anchura");
        double Anchura=lector.nextDouble();

        System.out.println("El Area del triangulo:" + Altura*Anchura/2);



    }

}