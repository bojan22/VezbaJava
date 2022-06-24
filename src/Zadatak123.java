import java.util.*;

public class Zadatak123 {
    public static void main(String[] args) {
        //Zadatak 1) Napraviti niz koji ce sadrzati nazive gradove i
        // treba odstampati sve gradove osim grada "Prag"

      /* String[] nizGradova = {"Belgrade", "Prag", "Budapest", "Paris", "London", "Moscow" };
       for (int i = 0; i< nizGradova.length; i++) {
           if (!nizGradova[i].equals("Prag")){
               System.out.println(nizGradova[i]);
           }
       }
     */

        // Zadatak 2 - Napisati program gde korisnik (djak) unosi poslednjih 5 ocena,
        // ako ima sve petice program vrati poruku "Odlican djak",
        // ako nema sve petice vraca poruku "Nije odlican djak"
        /*
        Scanner sc = new Scanner(System.in);


        System.out.println("Unesite ocene za djaka");
        int sumaOcena = 0;
        for (int i = 0; i<5; i++) {
            int ocena = sc.nextInt();
            if (ocena > 5 || ocena <= 0) {
                System.out.println("Uneli ste pogresnu ocenu, unesite ocenu od 1 do 5");
                break;
            }
            sumaOcena = sumaOcena + ocena;
        } if(sumaOcena == 25){
            System.out.println("Djak je odlican");
        }else {
            System.out.println("Djak nije odlican");
        }
        }



        }
    */
        //Zadatak 3 - Uneti dvocifren broj i prikazati prvu i drugu cifru

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite dvocifren broj: ");
        int broj = sc.nextInt();

        int prvaCifra = broj / 10;
        int drugaCifra = broj % 10;



        System.out.println("Prva cifra je"+ prvaCifra + " Druga cifra je " + drugaCifra);

    }






    }




