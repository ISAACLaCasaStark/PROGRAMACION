import java.util.ArrayList;
import java.util.List;

class Cita {
    private int hora;
    private int minuts;
    private String titol;
    private String text;

    public Cita(int hora, int minuts, String titol, String text) {
        this.hora = hora;
        this.minuts = minuts;
        this.titol = titol;
        this.text = text;
    }

    public void modificarText(String nouText) {
        this.text = nouText;
    }

    public String getTitol() {
        return titol;
    }

    public void mostrarCita() {
        System.out.println("Cita: " + titol + " a las " + hora + ":" + minuts);
        System.out.println("Text: " + text);
    }
}

class Pagina {
    private int dia;
    private int mes;
    private List<Cita> cites = new ArrayList<>();

    public Pagina(int dia, int mes) {
        this.dia = dia;
        this.mes = mes;
    }

    public void afegirCita(Cita c) {
        cites.add(c);
    }

    public void borrarCita(String titol) {
        for (int i = 0; i < cites.size(); i++) {
            if (cites.get(i).getTitol().equals(titol)) {
                cites.remove(i);
                break;
            }
        }
    }

    public void mostrarCites() {
        System.out.println("Cites del " + dia + "/" + mes + ":");
        for (Cita c : cites) {
            c.mostrarCita();
        }
    }
}

class Agenda {
    private int any;
    private List<Pagina> pagines = new ArrayList<>();

    public Agenda(int any) {
        this.any = any;
    }

    public void afegirPagina(Pagina p) {
        pagines.add(p);
    }

    public void mostrarPagines() {
        for (Pagina p : pagines) {
            p.mostrarCites();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Agenda agenda = new Agenda(2025);
        
        Pagina pagina1 = new Pagina(7, 2);
        Cita cita1 = new Cita(10, 30, "Dentista", "Revisió dental");
        Cita cita2 = new Cita(15, 00, "Reunió", "Reunió de treball");
        
        pagina1.afegirCita(cita1);
        pagina1.afegirCita(cita2);

        agenda.afegirPagina(pagina1);
        agenda.mostrarPagines();
    }
}
