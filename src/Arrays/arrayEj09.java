package Arrays;
import java.util.Scanner;
public class arrayEj09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arrayNum = new int [8];

        System.out.println("Por favor escriba 8 números: ");

        for (int i = 0; i < 8; i++) {
            arrayNum[i] = sc.nextInt();
        }

        for (int i = 0; i < 8; i++) {
            System.out.print(arrayNum[i]);

            if (arrayNum[i]%2 == 0) {
                System.out.println(" es par");
            } else {
                System.out.println(" es impar");
            }
        }
    }
}
