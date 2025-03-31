import java.util.Scanner;

public class LeerEnteros {
    public static void main (String[] args){
        LeerEnteros programa = new LeerEnteros();
        programa.inici();
    }
    public void inici(){
        System.out.println("Llegir un enter pel teclat:");
        int a = llegirEnterTeclat();
        System.out.println("L'enter ha estat " + a + ".");
        System.out.println("Llegiu un altre enter pel teclat:");
        a = llegirEnterTeclat();
        System.out.println("L'altre enter ha estat " + a + ".");
    }
    public int llegirEnterTeclat(){
        Scanner lector = new Scanner(System.in);
        int enterLlegit = 0;
        boolean llegit = false;
    while(!llegit){
        llegit = lector.hasNextInt();
        if(llegit){
            enterLlegit =lector.nextInt();
        }
        else{
            System.out.println("Aixó no és un enter");
            lector.next();
        }
    }
    lector.nextLine();
    return enterLlegit;
    }
}
}
