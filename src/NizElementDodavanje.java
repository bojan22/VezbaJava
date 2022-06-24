public class NizElementDodavanje {
    public static void main(String[] args) {
        //Napravite niz koji ima elemente od 1 do 100 ukljucujuci 100 ali NE PESKE.
        // int[] niz = {1, 2,... 100} // NE OVAKO
        int[] niz= new int[101];
        for(int i = 0; i < niz.length; i++){
            i = 0;
            niz[i]=i;


        }
        System.out.println(niz[1]);
    }
}
