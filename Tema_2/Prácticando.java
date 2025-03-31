public class Prácticando {

    public static void main(String[] args) {
        
    int [] vector = new int [10]; //array VECTOR de tamaño 10
    int contador = 0; //contador para llenar luego el código del 1 al 10
    int suma = 0; //int vacío para luego poner la suma
    int min = 0; // int para encontar el mínimo
    int max = 0; // int para encontrar el máximo

    for (int i = 0; i < vector.length; i++){ //for para que recorra el vector
        contador++; // por cada pasada, suma 1 al contador
        vector[i] = contador; //cada pasada, añade 1 al vector (para que haga 1,2,3,4....)

        if (vector[i]< min){ //si el número del vector es MENOR que el MÍNIMO, ponerlo en min y guardarlo
            min = vector[i];
        }
        if (vector[i] > max){ // si el número del vector es MAYOR que el MÁXIMO, ponerlo en max y guardarlo
            max = vector[i];
        }
        

        System.out.print("[ ");
        System.out.print(vector[i]+ " "+ "]"); //IMPRIMIR todo el vector
        suma += vector[i]; //SUMAR todos los números en suma
        

    } System.out.println();


    System.out.println("Suma: "+ suma); //IMPRIMIR TODOS LOS INT GUARDADOS DEL FOR
    System.out.println("Min: "+ min);
    System.out.println("Max: "+ max);


    
    }
}