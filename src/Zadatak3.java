import java.util.*;

public class Zadatak3 {
    public static void main(String[] args) {
        //Zadatak 3 - Imamo dve kockice ispred nas (plava i crvena),
        // preko skenera treba uneti koju kockicu bacamo i koji broj smo dobili.
        // Ako bacimo plavu kockicu i dobijemo 1, onda dobijamo 1 poen, ako dobijemo 2 onda dobijamo 2 poena,
        // ako dobijemo 3,4,5 ili 6 onda dobijamo 10 poena.
        // Crvena kockica ima ista pravila kao i plava samo sto donosi duplo vise poena.

        Scanner sc = new Scanner(System.in);
        String kocka;
        int broj;

        System.out.println("Koju kocku bacate: -plava -crvena? ");
        kocka = sc.next();
        System.out.println("Broj je: ");
        broj = sc.nextInt();
        //plava kocka
        if (kocka.equals("plava") && (broj == 1)) {
            System.out.println("Izabrali ste plavu kocku i dobili 1 poen");
        } else if (kocka.equals("plava") && (broj == 2)) {
            System.out.println("Izabrali ste plavu kocku i dobili 2 poena");
        } else if (kocka.equals("plava") && ((broj >= 3) && (broj <= 6))) {
            System.out.println("Izabrali ste plavu kocku i dobili 10 poena");
        }

        //crvena kocka
            if (kocka.equals("crvena") && broj == 1) {
                System.out.println("Izabrali ste crvenu kocku i dobili 2 poena");
            } else if (kocka.equals("crvena") && broj == 2) {
                System.out.println("Izabrali ste crvenu kocku i dobili 4 poena");
            } else if (kocka.equals("crvena") && (broj >= 3) && (broj <= 6)) {
                System.out.println("Izabrali ste crvenu kocku i dobili 20 poena");
            } else
            {
                System.out.println("pogresna kocka");


        }


    }
}// DRUGI NACIN
/*import java.util.Scanner;

public class Zadatak7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Bacite kockicu");
        int kocka1 = sc.nextInt();
        System.out.println("Koje je boje kockica?");
        String kocka2 = sc.next();

        if (kocka1 == 1 && kocka2.equals("plava")) {
            System.out.println("Dobili ste 1 poen");
        } else if (kocka1 == 1 && kocka2.equals("crvena")) {
            System.out.println("Dobili ste 2 poena");
        } else if (kocka1 == 2 && kocka2.equals("plava")) {
            System.out.println("Dobili ste 2 poena");
        } else if (kocka1 == 2 && kocka2.equals("crvena")) {
            System.out.println("Dobili ste 4 poena");
        } else if ((kocka1 == 3 || kocka1 == 4 || kocka1 == 5 || kocka1 == 6) && kocka2.equals("plava")) {
            System.out.println("Dobili ste 10 poena");
        } else if ((kocka1 == 3 || kocka1 == 4 || kocka1 == 5 || kocka1 == 6) && kocka2.equals("crvena")) {
            System.out.println("Dobili ste 20 poena");
        } else {
            System.out.println("Uneli ste pogresnu boju i/ili broj na kockici");
        }


    }
}*/
