package Arrays;

public class arrayEj13 {
    public static void main(String[] args) {
        int[] arrayNum = new int [100];
        int numMayor = 0;
        int numMenor = 0;

        for (int i = 0; i < 100; i++) {

            arrayNum[i] = (int)(Math.random()*101)+0;

            if (i == 0) {
                numMayor = arrayNum[i];
                numMenor = arrayNum[i];
            }
            if (arrayNum[i] > numMayor) {
                numMayor = arrayNum[i];
            }
            if (arrayNum[i] < numMenor) {
                numMenor = arrayNum[i];
            }
        }

        for (int i = 0; i < 100; i++) {
            if (arrayNum[i] == numMayor || arrayNum[i] == numMenor) {
                System.out.print("**" + arrayNum[i] + "**  ");
            } else {
                System.out.print(arrayNum[i] + "  ");
            }
        }
    }
}
