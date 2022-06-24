import java.util.*;

public class Zadatak7 {
    public static void main(String[] args) {
        //Zadatak 3 - Prikazati sve dvocifrene brojeve deljive sa 3 - Koristiti FOR

       /* int i;

        for(i=10; i<=99; i++){
        if(i % 3 ==0){
            System.out.println(i);
        }
        }

        */


//Zadatak 4 - Prikazati aritmeticku sredinu od 1 do N - Koristiti WHILE
        Scanner sc = new Scanner(System.in);
        /*int a = 1;
        int n;
        int suma = 0;
        System.out.println("Unesite broj");
        n = sc.nextInt();
        while (a<=n) {
            suma += a;
            a++;
        }
        System.out.println("Aritmeticka sredina je: "+ (suma/n));*/



//Zadatak 5 - Korisnik unosi brojeve preko skenera i potrebno je racunati sumu dok
// korisnik ne unese negativan broj - Koristiti DO WHILE

        int x;
        int suma = 0;
        do {
            System.out.println("Unesite broj:  ");
            x= sc.nextInt();
            if(x>0) {
                suma = suma + x;
            }
            System.out.println("Trenutna suma je: " + suma);
        } while (x > 0);
        System.out.println("Konacna suma je: " + suma);
    }
}
