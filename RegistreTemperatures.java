import java.util.Scanner;

public class RegistreTemperatures {
    private static final int MAX_SETMANES = 52;
    private int numTemperatures = 0;
    private float[] temperatures = new float[MAX_SETMANES * 7];

    public static void main(String[] args) {
        RegistreTemperatures programa = new RegistreTemperatures();
        programa.inici();
    }

    public void inici() {
        boolean continuar = true;
        while (continuar) {
            mostrarMenu();
            continuar = tractarOpcio();
        }
    }

    public void mostrarMenu() {
        System.out.println("1. Registre temperatures setmanals");
        System.out.println("2. Mostrar mitjana");
        System.out.println("3. Mostrar diferència");
        System.out.println("4. Finalitzar execució");
        System.out.print("Selecciona una opció: ");
    }

    public boolean tractarOpcio() {
        Scanner scanner = new Scanner(System.in);
        int opcio = scanner.nextInt();

        if (opcio == 1) {
            registreTemperaturesSetmanals();
            return true;
        } else if (opcio == 2) {
            mostrarMitjana();
            return true;
        } else if (opcio == 3) {
            mostrarDiferencia();
            return true;
        } else if (opcio == 4) {
            finalitzarExecucio();
            return false;
        } else {
            System.out.println("Opció no vàlida.");
            return true;
        }
    }

    public void registreTemperaturesSetmanals() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introdueix les temperatures de la setmana:");
        for (int i = 0; i < 7; i++) {
            System.out.print("Dia " + (i + 1) + ": ");
            temperatures[numTemperatures] = scanner.nextFloat();
            numTemperatures++;
        }
    }

    public void mostrarMitjana() {
        try {
            float suma = 0;
            // Aquí forzamos el error Marina
            for (int i = 0; i < temperatures.length + 5; i++) {

                suma = suma + temperatures[i];
            }
            float mitjana = suma / numTemperatures;
            System.out.println("La mitjana és: " + mitjana);
        } catch (Exception e) {
            System.out.println("Error al calcular mitjana: " + e);
        }
    }

    public void mostrarDiferencia() {
        try {
            float max = temperatures[0];
            float min = temperatures[0];
            for (int i = 1; i < numTemperatures; i++) {
                if (temperatures[i] > max) {
                    max = temperatures[i];
                }
                if (temperatures[i] < min) {
                    min = temperatures[i];
                }
            }
            float diferencia = max - min;
            System.out.println("La diferència màxima és: " + diferencia);
        } catch (Exception e) {
            System.out.println("Error al calcular diferència: " + e);
        }
    }

    public void finalitzarExecucio() {
        System.out.println("Programa finalitzat.");
    }
}
