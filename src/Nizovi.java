public class Nizovi {
    public static void main(String[] args) {
        System.out.println("Pocetak programa");

        //int[] mojNiz; // deklaracija niza
        //mojNiz = {1, 2, 3, 4 ,5 ,6 ,7, 8}; //inicijalizcija niza

        int[] niz1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // u 1 linije deklaracija i inicijaliziacija niza

        System.out.println("Prvi element je: " + niz1[0]);
        System.out.println("Drugi element je: " + niz1[1]);
        System.out.println("Treci element je: " + niz1[2]);
        //...
        System.out.println("Poslednji element je indeksu: " + niz1[9]);
        //out of bounds:
        //System.out.println("Pokusaj: " + niz1[10]);

        int[] niz2 = new int[10];
        System.out.println("Duzina niza 2 je :" + niz2.length);
        int x; // x == 0
        String s; // s == null
        boolean b; // b == false
        System.out.println("Prvi element niza 2 je: " + niz2[0]);
        niz2[0] = 100; // menjamo vrednosti elementa niza
        System.out.println("Prvi element niza 2 je: " + niz2[0]);
        niz2[1] = 200; // drugi element u nizu 2 postaje 200



    }
}