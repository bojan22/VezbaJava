public class IzbrisatiKanije {
    public static void main(String[] args) {
    /*
        int[] niz = {4,9,99,-200,11,-5,-16,199,282,-100,5,900};
        int min = 0;
        int max = 0;
        min = niz[0];
        max = niz[0];
        for (int i = 0; i<niz.length; i++){
            if(min>niz[i]){
                min=niz[i];
            }
            if(max<niz[i]){
                max=niz[i];
            }
        }
        System.out.println(min);
        System.out.println(max);*/

       // Napisati niz od 10 brojeva koji ce se sabirati do 100, kada predje 100 treba ispisati za koliko je presao
        //Na primer ako imamo niz 80, 10, 9, 3, 5, 7, 22, 90, 8
        //Treba da nam ispise 80, 10, 9, 3 i onda poruka "Presli ste granicu za 2"


        int[] niz = {80, 10, 9, 3, 5, 7, 22, 90, 8};
        int suma = 0;
        for (int i = 0; i<niz.length; i++){
            suma = suma + niz[i];
            System.out.print(niz[i]+" ");
            if(suma > 100){
                System.out.println("Presli ste granicu za "+ (suma - 100));
                break;

            }
        }




    }
}
