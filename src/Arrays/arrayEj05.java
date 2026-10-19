package Arrays;
import java.util.Scanner;
import java.util.Arrays;

public class arrayEj05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numero = new int[10];
        int maximo = 0;
        int minimo = 0;

        for (int i = 0; i < 10; i++){
            numero[i] = sc.nextInt();

            if (i == 0) {
                maximo = numero[i];
                minimo = numero[i];
            }
            if (numero[i] > maximo) {
                maximo = numero[i];
            }
            if (numero[i] < minimo) {
                minimo = numero[i];
            }
        }

        for (int i = 0; i < 10; i++) {

            System.out.print(numero[i]);

            if (numero[i] == maximo) {
                System.out.println("(máximo)");
            } else if (numero[i] == minimo) {
                System.out.println("(mínimo)");
            } else {
                System.out.println();
            }

        }

    }
}
