import java.util.*;

public class Zadatak10 {
    public static void main(String[] args) {
        //Zadatak2: Napisati program koji racuna  aritmeticku sumu svih elemenata niza, od prvog elementa niza do n
        // gde je n poslednji element niza ... u prevodu niz[0] + niz[1} + niz[2] + ... + niz[n]

        //Zadatak 3:  Napisati program koji izracunava geometrijsku sumu parnih brojeva na neparnim indeksima:
        // niz[0] * niz[1] * ... * niz[n] (edited)
        Scanner sc = new Scanner(System.in);

        //Zadatak 3 sa dopunom

       /* System.out.println("Unesite duzinu niza: ");
        int duzinaNiza = sc.nextInt();
        int suma = 0;
        int[] niz = new int[duzinaNiza];
        for (int i = 0; i < duzinaNiza; i++) {

                System.out.println("Unesite vrednosti: ");
                niz[i] = sc.nextInt();

                suma = suma + niz[i];
        }
        System.out.println(suma);*/

        //Zadatak 3:  Napisati program koji izracunava geometrijsku sumu PARNIH brojeva na NEPARNIM indeksima:
        //        // niz[0] * niz[1] * ... * niz[n]

        int suma1 = 1;

        System.out.println("Uneste duzinu niza: ");
        int duzinaNiz1 = sc.nextInt();

        int niz2[] = new int[duzinaNiz1];

        for (int i = 0; i < duzinaNiz1; i++) {
            System.out.println("Unesite broj na pozicji" +i+ "u nizu:");
            niz2[i] = sc.nextInt();
            if (i % 2 != 0 && niz2[i] % 2 == 0) {
                suma1 = suma1 * niz2[i];
            }
            System.out.println(suma1);


        }
    }
}
