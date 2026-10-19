package Arrays;
import java.util.Scanner;

public class arrayEj03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arrayNumeros = new int[10];

        System.out.println("Escribe 10 números");

        for (int i = 0; i < 10; i++) {

            arrayNumeros[i] = sc.nextInt();

        }

        System.out.println("Lo numeros a la inversa de lo que has escrito son: ");

        for (int i = 9; i >= 0; i--) {

            System.out.print(arrayNumeros[i]);
            System.out.print(" ");

        }
    }
}
