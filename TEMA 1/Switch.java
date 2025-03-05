import java.util.Scanner;

class ContadorDeMeses {
 	public static void main(String[] args) {
	Scanner lector = new Scanner (System.in);

	System.out.println ("Coloca el numero del mes");
	int mes = lector.nextInt();

    switch (mes){ // <-switch siempre va con "case" y cerrando con "default" (en este caso default es más practico que "if")
        case 2: 
        	System.out.println("Este mes tiene 28 o 29 días");
        	break; // <-cerrando cada caso

        case 1,3,5,7,8,10,12: 
        	System.out.println("Este mes tiene 31 días");
        	break;

        case 4,6,9,11: 
        	System.out.println("Este mes tiene 30 días");
        	break;
    } // <-cerrando "switch"

    if (mes >12) { // <-probando con "if" sabiendo que lo correcto sería cerrar con "default"
        System.out.println ("Error: el numero es superior que 12");
    }

	}// <-cada corchete tiene que ir aliniado con la linia vertical continua

}
