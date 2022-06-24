public class PoredjenjeNiza {
    public static void main(String[] args) {
        //Zadatak 5 - Napraviti dva niza i prikazati koji niz ima vise clanova, a koji niz ima vecu sumu

        int[] niz1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 50};
        int[] niz2 = {3, 5, 6, 9, 6};

        int suma1 = 0;
        int suma2 = 0;

        if(niz1.length > niz2.length) {
            System.out.println("Duzi niz je niz1 i njegova ukupna duzina je: " + niz1.length);
        }else{
            System.out.println("Duzi niz je niz2 i njegova ukupna duzina je: " + niz2.length);}

        for(int i = 0 ; i<niz1.length; i++){
            suma1 = suma1 + niz1[i];
            }


        for (int j = 0; j< niz2.length; j++){
            suma2 = suma2 + niz2[j];
        }

        if(suma1>suma2) {
            System.out.println("Veca suma je iz niza1 i ona je: " + suma1);
        }
            else{
            System.out.println("Veca suma je iz niza2 i ona je: " + suma2);
        }

        }
    }

