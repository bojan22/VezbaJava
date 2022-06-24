

public class Experiment {
    public static void main(String[] args) {
        int x = 5;
        int y = x;
        System.out.println("Y je " + y); // ?
        x = 10;
        System.out.println("Y je " + y); // ?

        int[] sedmicaNaLotou = {44, 2, 0, 1, 22, 34, 55};
        System.out.println("Pokazivac, refenca" + sedmicaNaLotou);
        int[] zikinNiz = sedmicaNaLotou; //zikin niz je vezan za sedmicu niz
        System.out.println("Prvi element Zikinog niza " + zikinNiz[0]);//?
        System.out.println("Pokazivac, refenca" + zikinNiz);
        sedmicaNaLotou[0] = 10000;
        System.out.println("Prvi element Zikinog niza " + zikinNiz[0]);//?

    }
}