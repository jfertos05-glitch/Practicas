package Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class arrayEj19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arrayNum = new int[12];
        int[] arrayNumCambiado = new int[12];

        for (int i = 0; i < 12; i++) {
            arrayNum[i] = (int)(Math.random()*201)+0;
        }

        System.out.println("Array original:");

        for (int i = 0; i < 12; i++) {
            System.out.printf(" %-3d", i);
        }

        System.out.println();

        for (int i = 0; i < 12; i++) {
            System.out.printf(" %-3d", arrayNum[i]);
        }

        System.out.print("\n\nIntroduzca el número que quiere insertar: ");
        int numInsertado = sc.nextInt();

        System.out.print("Introduzca la posición donde lo quiere insertar (0 – 11): ");
        int numPosicion = sc.nextInt();

        for (int i = 0; i < numPosicion; i++) {
            arrayNumCambiado[i] = arrayNum[i];
        }

        arrayNumCambiado[numPosicion] = numInsertado;

        for (int i = numPosicion+1; i < 12; i++) {
            arrayNumCambiado[i] = arrayNum[i-1];
        }

        System.out.println("\nArray cambiado:");

        for (int i = 0; i < 12; i++) {
            System.out.printf(" %-3d", i);
        }

        System.out.println();

        for (int i = 0; i < 12; i++) {
            System.out.printf(" %-3d", arrayNumCambiado[i]);
        }
    }
}
