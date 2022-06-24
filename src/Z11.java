import java.util.*;

public class Z11 {
    /* Napisati program koji racuna  aritmeticku sumu svih elemenata niza, od prvog elementa niza do n gde je n
    poslednji element niza ... u prevodu niz[0] + niz[1} + niz[2] + ... + niz[n]
napisati program koji prvo samo stampa elemente niza
onda smisliti kako da racunamo sumu*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arSuma = 0;
        System.out.println("Unesite ukupan broj u nizu: ");
        int duzinaNiza = sc.nextInt();
        int korisnikovNiz[] = new int[duzinaNiza];
        for(int i = 0; i< korisnikovNiz.length; i++){
            System.out.println("Unesite brojeve u nizu: ");
            korisnikovNiz[i] = sc.nextInt();
            arSuma = arSuma + korisnikovNiz[i];
        }
        System.out.println(arSuma/duzinaNiza);


    }
}
