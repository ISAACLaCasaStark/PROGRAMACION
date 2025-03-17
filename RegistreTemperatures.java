import java.util.Scanner;

public class RegistreTemperatures {
    // Constants
    private static final int MAX_SETMANES = 52;

    // Variables globals
    private int numTemperatures = 0;
    private float[] temperatures = new float[MAX_SETMANES * 7];

    // Mètodes associats al problema general
    public static void main(String[] args) {
        RegistreTemperatures programa = new RegistreTemperatures();
        programa.inici();
    }

    public void inici() {
        boolean running = true;
        while (running) {
            mostrarMenu();
            running = tractarOpcio();
        }
    }

    // Mètodes associats al punt 2
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

        switch (opcio) {
            case 1:
                registreTemperaturesSetmanals();
                return true; // Continúa ejecutando
            case 2:
                mostrarMitjana();
                return true; // Continúa ejecutando
            case 3:
                mostrarDiferencia();
                return true; // Continúa ejecutando
            case 4:
                finalitzarExecucio();
                return false; // Termina la ejecución
            default:
                System.out.println("Opció no vàlida. Intenta de nou.");
                return true; // Continúa ejecutando
        }
    }

    // Mètodes associats al punt 3
    public void registreTemperaturesSetmanals() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Registre de temperatures per a la setmana:");
        for (int i = 0; i < 7; i++) {
            System.out.print("Temperatura del dia " + (i + 1) + ": ");
            temperatures[numTemperatures++] = scanner.nextFloat();
        }
    }

    public void mostrarMitjana() {
        if (numTemperatures == 0) {
            System.out.println("No hi ha temperatures registrades.");
            return;
        }
        float suma = 0;
        for (int i = 0; i < numTemperatures; i++) {
            suma += temperatures[i];
        }
        System.out.println("La mitjana de temperatures és: " + (suma / numTemperatures));
    }

    public void mostrarDiferencia() {
        // Aquí puedes implementar la lógica para mostrar la diferencia entre temperatures
        System.out.println("Funcionalitat no implementada.");
    }

    public void finalitzarExecucio() {
        System.out.println("Execució finalitzada.");
    }
}