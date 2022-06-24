public class Jelka {
    public static void main(String[] args) {

        String razmak = " ";
        String z = "*";
        for (int i=5 ; i>1 ; i--) {
            for (int j = 0 ; j < i ; j++) {
                System.out.print(razmak);
            }
            System.out.println(z);
            z = z + "**";
        }

        for (int i = 0 ; i < 2 ; i++) {
            for (int j = 0 ; j < 5 ; j++) {
                System.out.print(razmak);
            }
            System.out.println("|");
        }
        System.out.println("Srecno na testu");

    }
}