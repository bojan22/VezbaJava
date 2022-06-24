import java.util.*;

public class BonusZadatak13 {
    public static void main(String[] args) {
        //Napraviti program koji ispisuje cifre ucitanog celog broja u obrnutom redosledu.
        Scanner sc = new Scanner(System.in);
        System.out.println("Izaberite broj: ");
        int broj = sc.nextInt();
        int obrnutiBroj=0;
        while(broj>=10){
            obrnutiBroj = obrnutiBroj*10 + broj%10 ;
            broj = broj /10;

        }
        obrnutiBroj = obrnutiBroj*10+broj;
        System.out.println(obrnutiBroj);



    }
}
