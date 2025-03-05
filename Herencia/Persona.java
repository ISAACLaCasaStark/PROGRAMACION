package Herencia;

public class Persona {
    private int id;
    private int edat;
    private String nom;
    private String cognom; 
    private String adreça;

    public Persona(int id, int edat, String nom, String cognom) {
        this.id = id;
        this.edat = edat;
        this.nom = nom;
        this.cognom = cognom;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public int getEdat() { return edat; }
    public void setEdat(int edat) { this.edat = edat; }

    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }

    public String getCognom() { return cognom; }
    public void setCognom(String cognom) { this.cognom = cognom; }

    public String getAdreça() { return adreça; }
    public void setAdreça(String adreça) { this.adreça = adreça; }

    public void imprimir() {
        System.out.println("Mis datos personales son:");
        System.out.println("id: " + getId());
        System.out.println("Edad: " + getEdat());
        System.out.println("Nombre: " + getNom());
        System.out.println("Apellido: " + getCognom());
    }
}
