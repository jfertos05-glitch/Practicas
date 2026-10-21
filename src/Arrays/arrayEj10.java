package Arrays;
import java.util.Scanner;
import java.util.Arrays;

public class arrayEj10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrayNum[] = new int[20];
        int arrayPar[] = new int[20];
        int arrayImpar[] = new int[20];
        int contadorPar = 0;
        int contadorImpar = 0;

        for (int i = 0; i < 20; i++) {
            arrayNum[i] = (int) (Math.random() * 100) + 0;
        }

        for (int i = 0; i < 20; i++) {
            if (arrayNum[i]%2 == 0) {
                arrayPar[contadorPar] = arrayNum[i];
                contadorPar++;
            }
        }

        for (int i = 0; i < 20; i++) {
            if (arrayNum[i]%2 != 0) {
                arrayImpar[contadorImpar] = arrayNum[i];
                contadorImpar++;
            }
        }

        System.out.println("Los números originales son: ");

        for (int i = 0; i < 20; i++) {
            System.out.println(arrayNum[i]);
        }

        System.out.println("Los números ordenados son: ");

        for (int i = 0; i < contadorPar; i++) {
            System.out.print(arrayPar[i] + " ");
        }

        for (int i = 0; i < contadorImpar; i++) {
            System.out.print(arrayImpar[i] + " ");
        }
    }
}
