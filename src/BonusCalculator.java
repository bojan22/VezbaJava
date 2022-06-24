import java.util.*;

public class BonusCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Molimo unesite broj prodaja: ");
        int brProdaja = sc.nextInt();
        System.out.println("Vasa trenuta plata je ");
        double plata = sc.nextDouble();

        if (brProdaja >= 10) {
            System.out.println("Vasa trenutna plata je uvecana za 10% i iznosi " + (plata + plata * 0.20));
        } else if (brProdaja >= 5) {
            System.out.println("Vasa trenutna plata je uvecana za 10% i iznosi " + (plata + plata * 0.05));
        } else if (brProdaja >= 2) {
            System.out.println("Vasa trenutna plata je uvecana za 10% i iznosi " + (plata + plata * 0.02));
        } else if (brProdaja >= 1) {
            System.out.println("Vasa trenutna plata je uvecana za 10% i iznosi " + (plata * plata * 0.01));
        }
        else {
            System.out.println("Niste odradili uspesnu prodaju");
        }

    }
}
