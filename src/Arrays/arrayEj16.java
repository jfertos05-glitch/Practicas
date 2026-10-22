package Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class arrayEj16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arrayNum = new int[20];

        for (int i = 0; i < 20; i++) {
            arrayNum[i] = (int)(Math.random()*401)+0;
        }

        for (int i = 0; i < 20; i++) {
            System.out.printf(" %-2d ", arrayNum[i]);
        }

        System.out.print("Quieres destacar los número de algún múltiplo: ");
        int respuesta = sc.nextInt();

        for (int i = 0; i < 20; i++) {

            if (arrayNum[i] % respuesta == 0) {
                System.out.printf(" |%-2d| ", arrayNum[i]);
            } else {
                System.out.printf(" %-2d ", arrayNum[i]);
            }
        }

    }
}
