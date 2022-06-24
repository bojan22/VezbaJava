public class Zadatak9 {
    public static void main(String[] args) {
        //prvi tip inicijalizacije
        String[] imePrezime = new String[2];
        System.out.println("Duzina niza je: " + imePrezime.length);
        imePrezime[0]= "Bojan Zivkovic";
        imePrezime[1]= "Bane Zivkovic";
        System.out.println(imePrezime[0] +" "+ imePrezime[1]);
        imePrezime[0] = "Bojan Petrovic";
        System.out.println("Novo prezime osobe 1 je: " + imePrezime[0]);

        //-----------------
        //drugi tip inicijalizacije

        String[] prezimeIme = {"Bojan Zivkovic", "Bane Zivkovic"};

        System.out.println("Duzina niza 2 je: "+ prezimeIme.length);

        System.out.println(prezimeIme[0] + prezimeIme[1]);
        prezimeIme[0] = "Bojan Petrovic";
        System.out.println("Novo prezime osobe 2 je: " + prezimeIme[0]);






    }
}
