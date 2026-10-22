package Arrays;

public class arrayEj21 {
    public static void main(String[] args) {
        int[] arrayNum = new int[15];
        int[] arrayNumCambiado = new int[15];
        int numACambiar = 0;

        for (int i = 0; i < 15; i++) {
            arrayNum[i] = (int)(Math.random()*501)+0;
        }

        for (int i = 0; i < 15; i++) {
            numACambiar = arrayNum[i];

           do {
               if (numACambiar % 5 != 0) {
                   numACambiar = numACambiar + 1;
               } else {

               }

           } while (numACambiar % 5 != 0);

            arrayNumCambiado[i] = numACambiar;

        }

        for (int i = 0; i < 15; i++) {
            System.out.printf(" %-2d ", arrayNum[i]);
        }

        System.out.println();

        for (int i = 0; i < 15; i++) {
            System.out.printf(" %-2d ", arrayNumCambiado[i]);
        }
    }
}
