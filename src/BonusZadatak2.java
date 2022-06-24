import java.util.*;

public class BonusZadatak2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Unesite Vase ime: ");
        String ime = sc.next();

        System.out.print("Unesite Vase prezime: ");
        String prezime = sc.next();

        System.out.print("Unesite pol: \n muski-zenski \n");
        String pol = sc.next();

        System.out.println("Unesite vasu godinu rodjenja ");
        int godine = sc.nextInt();

        System.out.println("Da li ucite za QA? \n DA-NE ");
        String qa = sc.next();

        if (qa.toUpperCase().equals("DA")) {
            System.out.println(ime +" " + prezime +"(" + pol +"), rodjen " + godine + ".godina uci za QA!");
        }else{
            System.out.println(ime +" " + prezime +"(" + pol +"), rodjen " + godine + ".godina ne uci za QA!");
        }

        }
    }





