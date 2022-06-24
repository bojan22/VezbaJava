public class NizoviPetlje {
    public static void main(String[] args) {
        int[] nizA = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        //System.out.println(nizA[0]); // nizA[1], nizA[2]
        int index = 0; // i, j...
        while (index < nizA.length) {
            System.out.println("Element na indeksu '" + index + "' ima vrednosti " + nizA[index]);
            index = index + 1; // 'index' postaje 'index + 1'
        }
        System.out.println("Kraj programa");

        for (int i = 0; i < nizA.length; i++) {
            System.out.println(nizA[i]);
        }
    }
}