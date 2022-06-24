import java.util.*;

public class Zadatak8 {
    public static void main(String[] args) {

        //Zadatak 6 - Preko skenera uneti broj N koji ce odredjivati koliko redova ce imati trougao
        //Zadatak 6 - Nacrtajte trougao sa N redova

        Scanner sc = new Scanner(System.in);
        int brRedova;
        //Nacrtajte trougao sa N redova
                System.out.println("Koliko redova zelite?");
                int n = sc.nextInt();
                String trougao = " ";
                for (int i = 0; i<n; i++){
                    String zvezdica = "*";
                    trougao=trougao+zvezdica;
                    System.out.println(trougao);


                }
            }
        }