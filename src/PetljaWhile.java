public class PetljaWhile {

    public static void main(String[] args) {

        for (int i = 0; i < 3; i++) {
            System.out.println("Hello");
        }
        //FOR petlja se koristi kada znamo unapred koliko puta zelimo da se izvrsi neka funkcija

        //------------

        int a = 0;
        while (a<3) {
            System.out.println("World");
            a++;
        }
        //WHILE petlja se koristi kada ne znamo unapred koliko puta zelimo da se izvrsi neka funkcija

        //------------

        int x = 0;
        do {
            System.out.println("!!!");
            x++;
        } while (x < 3);
        //DO WHILE petlja se koristi kada znamo da ce petlja barem jednom da se izvrsi
    }
}