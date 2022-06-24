import java.util.*;

public class Vezbe1 {
    public static void main(String[] args) {
        //Napraviti program koji služi za prikupljanje proudžbine od korisnika, stavke porudžbine
        //smestiti u niz stringova a cenu u niz decimalnih brojeva. Potom odrediti najjefitniji i
        //najskuplji deo porudžbine. (Ispisati naziv stavke kao i cenu)

      /*  Scanner sc = new Scanner(System.in);
        double minCena = 0;
        double maxCena = 0;
        int minIndex = 0;
        int maxIndex = 0;
        System.out.println("Unesite ukupan broj proizvoda");
        int n = sc.nextInt();
        String[] proizvodi = new String[n];
        double[] cene = new double[n];
        System.out.println("Unesite naziv 1. proizvoda: ");
        proizvodi[0] = sc.next();
        System.out.println("Unesite cenu 1. proizvoda: ");
        cene[0] = sc.nextInt();
        minCena = cene[0];

        for (int i = 1; i < proizvodi.length; i++) {
            System.out.println("Unesite naziv " + (i + 1) + ". proizvoda: ");
            proizvodi[i] = sc.next();
            System.out.println("Unesite cenu " + (i + 1) + ". proizvoda: ");
            cene[i] = sc.nextInt();
            if (cene[i] < minCena) {
                minCena = cene[i];
                minIndex = i;
            }
            if (cene[i]>maxCena){
                maxCena = cene[i];
                maxIndex = i;
            }

        }
        System.out.println("najjeftiniji proizvod je  " + proizvodi[minIndex] + "  a cena je" + cene[minIndex]);
        System.out.println("najskuplji proizvod je " + proizvodi[maxIndex] + " a cena je "+ cene[maxIndex]);


   */
        //korisnik unosi broj i da se prikaze obrnutim redsledom

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite pozitivan broj");
        int broj = sc.nextInt();
        int cifra = 0;
        int okrenutBroj = 0;

           //1234
        while (broj > 10 ){
            cifra = broj % 10;
            okrenutBroj = okrenutBroj * 10 + cifra;
            broj = broj / 10;
        }
        okrenutBroj = okrenutBroj * 10 + broj;
        System.out.println(okrenutBroj);


        }
        // 1234 % 10 = 4
        // 0 = 4



        }



