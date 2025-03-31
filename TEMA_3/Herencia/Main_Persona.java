package Herencia;

public class Main_Persona {
    public static void main(String[] args) {
        Persona p = new Persona(3855653, 25, "ISAAC", "RIVAS"); 
        p.imprimir();

        Estudiant e = new Estudiant(3855653, 25, "ISAAC", "RIVAS", 1, "PROGRAMACIÓN", "PRAT EDUCACIÓ", 4.5);
        e.imprimir();
    }
}
