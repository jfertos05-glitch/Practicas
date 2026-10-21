package Arrays;
import java.util.Scanner;
import java.util.Arrays;

public class arrayEj06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrayNum[] = new int[5];

        System.out.println("Por favor, escribe 15 números:");

        for (int i = 0; i < 5; i++) {
            arrayNum[i] = sc.nextInt();
        }

        int num = arrayNum[4];

        for (int i = 4; i > 0; i--) {
            arrayNum[i] = arrayNum[i-1];
        }

        arrayNum[0] = num;

        for (int i = 0; i < 5; i++) {
            System.out.println(arrayNum[i]);
        }
    }
}
