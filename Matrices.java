public class Matrices {
    public static void main(String[] args) {

        int[][] matriuParells = new int[10][10];

        for (int i = 0; i < matriuParells.length; i++) {
            for (int j = 0; j < matriuParells[i].length; j++) {
                if (i % 2 == 0 && j % 2 == 0) { 
                    matriuParells[i][j] = -1;
                }
                System.out.print(matriuParells[i][j] + " ");
            }
            System.out.println("   --> Fila " + i);
        }
    }
}
