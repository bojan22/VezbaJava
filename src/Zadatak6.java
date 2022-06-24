import java.util.*;

public class Zadatak6 {
    public static void main(String[] args) {
        //Zadatak 2 - Napraviti for petlju koja ce da se pokrene 5 puta. Svaki put ce traziti od korisnika da
        // unese neki broj. Ako korisnik unese 0 onda je potrebno ispisati "Bingo!"

        Scanner sc = new Scanner(System.in);

        int a;

        for(a = 0; a <6; a++){

            System.out.println("Unesite broj:  ");
            a = sc.nextInt();

            System.out.println("Uneli ste broj: "+ a);
            if (a == 0){
                System.out.println("BINGO!!");
            }
        }

    }
}
