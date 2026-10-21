package Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class arrayEj11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[10];

        for (int i = 0; i < 10; i++) {
            num[i] = sc.nextInt();
        }

        //Orden original

        System.out.print("Indice ");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%3d", i);
        }
        System.out.println();

        System.out.print("Valor  ");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%3d", num[i]);
        }
        System.out.println();

        //Orden cambiado

        System.out.println();
        System.out.println();

        System.out.print("Indice ");

        for (int i = 0; i < 10; i++) {
            System.out.printf("%3d", i);
        }

        System.out.println();

        System.out.print("Valor  ");

        for (int i = 0; i < 10; i++) {

            boolean esPrimo = true;

            if (num[i] <= 1) {
                esPrimo = false;
            } else {
                for (int a = 2; a < num[i]; a++) {
                    if (num[i] % a == 0) {
                        esPrimo = false;
                    }
                }
            }

            if (esPrimo) {
                System.out.printf("%3d", num[i]);
            }
        }

        for (int i = 0; i < 10; i++) {

            boolean esPrimo = true;

            if (num[i] <= 1) {
                esPrimo = false;
            } else {
                for (int a = 2; a < num[i]; a++) {
                    if (num[i] % a == 0) {
                        esPrimo = false;
                    }
                }
            }

            if (!esPrimo) {
                System.out.printf("%3d", num[i]);
            }
        }
    }
}
