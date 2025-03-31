package Herencia;

public class Estudiant extends Persona {
    private int curs;
    private String assignatures;
    private String escoles;
    private double notes; 

    public Estudiant(int id, int edat, String nom, String cognom, int curs, String assignatures, String escoles, double notes) {
        super(id, edat, nom, cognom); 
        this.curs = curs;
        this.assignatures = assignatures;
        this.escoles = escoles;
        this.notes = notes;
    }

    public int getCurs() { return curs; }
    public void setCurs(int curs) { this.curs = curs; }

    public String getAssignatures() { return assignatures; }
    public void setAssignatures(String assignatures) { this.assignatures = assignatures; }

    public String getEscoles() { return escoles; }
    public void setEscoles(String escoles) { this.escoles = escoles; }

    public double getNotes() { return notes; } 
    public void setNotes(double notes) { this.notes = notes; }

    @Override
    public void imprimir() {
        System.out.println("Soy un estudiante:");
        System.out.println("id: " + getId());
        System.out.println("Edad: " + getEdat()); 
        System.out.println("Nombre: " + getNom());
        System.out.println("Apellido: " + getCognom());
        System.out.println("Curso: " + getCurs());
        System.out.println("Asignaturas: " + getAssignatures());
        System.out.println("Instituto: " + getEscoles());
        System.out.println("Notas: " + getNotes());
    }
}
