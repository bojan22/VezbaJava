import java.util.*;

public class SumaCifara {
    public static void main(String[] args) {
        //Zadatak 4 - Unositi brojeve sve dok se ne unesu dva ista broja za redom,
        // nakon toga prikazati sumu svih prethodno unetih brojeva
        Scanner sc = new Scanner(System.in);

        /*int broj = 0;
                int suma = 0;
                int prethodniBroj;
                do {
                    prethodniBroj = broj;
                    System.out.println("Unesite broj");
                    broj = sc.nextInt();
                    suma = suma + broj;
                } while (prethodniBroj != broj);

                System.out.println("Suma je " + suma);*/
            int suma = 0;
            int broj = sc.nextInt();
           // suma = broj;
            for (int i = 0; broj !=0; i++){
                suma = suma + broj;
                broj = sc.nextInt();

            }
        System.out.println(suma);

            }
        }