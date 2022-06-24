import java.util.*;

public class BonusZadatak12 {
    public static void main(String[] args) {
        //Napisati program koji ispisuje zbir cifara ucitanog celog broja.
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite broj: ");
        int broj = sc.nextInt();
        int suma = 0;
        while(broj>=10){
            suma = suma + broj%10;
            broj = broj/10;
        }
        suma = suma + broj;
        System.out.println("Suma brojeva je: " + suma);


    }
        //broj je 365
    }


