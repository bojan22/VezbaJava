import java.util.*;

public class Zadatak1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String ime;
        String pol;
        int brojGodina;

        System.out.println("Unesite Vase ime: ");
        ime = sc.next();
        System.out.println("Unesite pol: -muski -zenski");
        pol = sc.next();
        System.out.println("Unesite Vase godine: ");
        brojGodina = sc.nextInt();

        if (brojGodina < 18) {
            System.out.println("Korisnik je maloletan");
            if (pol.equals("muski")) {
                System.out.println("Gospodine " + " " + ime);
            } else if (pol.equals("zenski")){
                System.out.println("Gospodjo" + " " + ime);
            }

        }
    }
}

