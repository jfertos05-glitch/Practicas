package Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class arrayEj12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arrayInicial = new int[10];
        int[] arrayFinal = new int[10];
        boolean bienHecho = true;
        int numIncial = 0;
        int numFinal = 0;

        for (int i = 0; i < 10; i++) {
            arrayInicial[i] = sc.nextInt();
        }

        System.out.print("Indice ");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%3d", i);
        }
        System.out.println();

        System.out.print("Valor  ");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%3d", arrayInicial[i]);
        }
        System.out.println();

        while (bienHecho) {
            System.out.print("¿Cual es el valor del inicio?: ");
            numIncial = sc.nextInt();
            System.out.print("¿Cual es el valor del final?: ");
            numFinal = sc.nextInt();

            if (numIncial >= 0 && numIncial < numFinal && numFinal <= 9 && numFinal >= 0) {
                bienHecho = false;
            } else {
                System.out.println("El número final debe ser mayor y del 0 al 9");
            }
        }

        int numeroInical = arrayInicial[numIncial];
        int numeroFinal = arrayInicial[numFinal];

        arrayFinal[0] = numeroInical;

        for (int i = 1; i <= numIncial; i++) {
            arrayFinal[i] = arrayInicial[i-1];
        }

        for (int i = numIncial+1; i < numFinal; i++) {
            arrayFinal[i] = arrayInicial[i];
        }

        arrayFinal[numFinal] = numeroInical;

        for (int i = numFinal+1; i <= 9; i++) {
            arrayFinal[i] = arrayInicial[i-1];
        }

        //Resultados

        System.out.print("Indice ");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%3d", i);
        }
        System.out.println();

        System.out.print("Valor  ");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%3d", arrayFinal[i]);
        }

    }
}
