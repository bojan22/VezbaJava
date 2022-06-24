import java.util.*;

public class Zadatak4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
                // Preko skenera uneti broj od 1 do 12 i ispisati koji je to mesec u godini

        int brojMeseci;

        System.out.println("Unesite broj meseca u godini");
        brojMeseci = sc.nextInt();
        switch (brojMeseci){
            case 1:
                System.out.println("Uneli ste Januar");
                break;
            case 2:
                System.out.println("Uneli ste Februar");
                break;
            case 3:
                System.out.println("Uneli ste Mart");
                break;
            case 4:
                System.out.println("Uneli ste April");
                break;
            case 5:
                System.out.println("Uneli ste Maj");
                break;
            case 6:
                System.out.println("Uneli ste Jun");
                break;
            case 7:
                System.out.println("Uneli ste Jul");
                break;
            case 8:
                System.out.println("Uneli ste Avgust");
                break;
            case 9:
                System.out.println("Uneli ste Septembar");
                break;
            case 10:
                System.out.println("Uneli ste Oktobar");
                break;
            case 11:
                System.out.println("Uneli ste Novembar");
                break;
            case 12:
                System.out.println("Uneli ste Decembar");
                break;
            default:
                System.out.println("Uneli ste nepostojeci mesec");
        }

    }
}
