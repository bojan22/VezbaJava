public class ZadatakNiz2 {
    public static void main(String[] args) {
        //Zadatak 6 - Napraviti jednocifreni niz (od 1 do 9), zatim potrebno je napraviti drugi niz
        //koji ce sadrzati prva tri parna broja prvog niza

        int[] niz0 = {10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
        int[] niz1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] niz2 = new int[6];
        int j = 0;
        int k = 0;
        for (int i = 0; i < niz1.length; i++) {
            if (niz1[i] % 2 == 0) {
                niz2[j] = niz1[i];
                j++;
            }
            if (j > 2) {
                break;
            }

        }
        for (int i = 0; i < niz0.length; i++) {
            if (niz0[i] % 2 != 0) {
                niz2[j] = niz0[i];
                j++;
            }
            if (j > 5) {
                break;
            }
        }

            for (int i = 0; i < niz2.length; i++) {
                System.out.println(niz2[i]);
            }

    }
}



