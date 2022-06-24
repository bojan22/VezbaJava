import java.util.Scanner;

public class AritmetickaSuma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ime = "Bojan";

        System.out.print("Unesite duzinu niza: ");
        int duzinaNiza = scanner.nextInt();

        int[] korisnikovNiz = new int[duzinaNiza];

        for (int i = 0; i < duzinaNiza; i++) {
            System.out.printf("%s unosi broj na %d poziciji: ", ime, i);//%s se odnosi na string %d digit
            korisnikovNiz[i] = scanner.nextInt();
        }
        //int[] nizA = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        //int summa = nizA[0] + nizA[1] + nizA[2]...;
        int suma = 0;
        for (int i = 0; i < duzinaNiza; i++) {
            suma += korisnikovNiz[i];
        }

        System.out.println("suma je " + suma);

        if (suma == 150) {
            System.out.println("Test case 1 je prosao");
        } else {
            System.out.println("Test case 1 je pao");
        }

        //System.out.println("Test case 1: " + (suma == 150));

    }
}