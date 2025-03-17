public class Exemple_Matrius {
    public static void main(String[] args) {


        int[][] matriuParells = new int[10][10];

        for(int i = 0; i < matriuParells.length; i++) {
            for(int j = 0; j < matriuParells[i].length; j++) {
                if (i%2 == 0) {
                System.out.print("0");
            }

            else {
                System.out.print(i);
            }
        }
        System.out.println("   --> Fila " + i);
    }
}
}
