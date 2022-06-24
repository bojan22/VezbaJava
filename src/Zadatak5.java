import java.util.*;

public class Zadatak5 {
    public static void main(String[] args) {
        //Zadatak 1 - Preko skenera uneti tri broja. Prvi broj ce odredjivati funkciju druga dva broja.
        // Ako se unese broj 1 onda druga dva moraju da se saberu, ako se unese 2 onda se od drugog oduzima treci,
        // ako se unese 3 onda se mnoze, ako se unese 4 onda se dele

        Scanner sc = new Scanner(System.in);

        int broj1;
        double broj2;
        double  broj3;

        System.out.println("Unesite drugi broj");
        broj2 = sc.nextDouble();
        System.out.println("Unesite treci broj");
        broj3 = sc.nextDouble();
        System.out.println("Unesite prvi broj");
        broj1 = sc.nextInt();
        switch (broj1){
            case 1:
                System.out.println("Drugi broj + treci broj je: "+(broj2+broj3));
                break;
            case 2:
                System.out.println("Drugi broj - treci broj je: " + (broj2-broj3));
            case 3:
                System.out.println("Drugi broj * treci broj je: " + (broj2*broj3));
            case 4:
                System.out.println("Drugi broj / treci broj je: "+ (broj2/broj3));
            default:
                System.out.println("Uneli ste pogresan broj");
                break;
        }





    }
}
