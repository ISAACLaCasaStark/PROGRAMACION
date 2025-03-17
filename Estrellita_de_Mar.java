public class Estrellita_de_Mar {
    public static void main(String[] args) {

        /*Estrellita(7);
        Estrellita(2);
        Estrellita(9);
        rayita(1);
        numero(6,5);
        rayita(5);
        numero(2,3);*/

        imprimir(7,'*');
        imprimir(1,'-');
        imprimir(6,'5');
        imprimir(3,'*');
        imprimir(5,'_');
        imprimir(2,'3');
    
    }

    public static void imprimir(int cantidad, char caracter){
        for(int i = 0; i < cantidad; i ++)
            System.out.print(caracter);{
        }
    System.out.println();{
    }

    }
}

    /*public static void Estrellita(int medida){
        for (int i = 0; i < medida; ++i){
            System.out.print("*");
        }
        System.out.println();

    }

    public static void rayita(int medida){
        for (int i = 0; i < medida; ++i){
            System.out.print("_");
        }
        System.out.println();
    }

    public static void numero(int medida, int num){
        for (int i = 0; i < medida; ++i){
            System.out.print(num);
        }
        System.out.println();*/

