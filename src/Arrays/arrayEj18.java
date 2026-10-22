package Arrays;

import java.util.Arrays;

public class arrayEj18 {
    public static void main(String[] args) {

        int[] arrayNum = new int[10];
        int[] menores = new int[10];
        int[] mayores = new int[10];
        int[] arrayNumCambiado = new int[10];

        int contMenores = 0;
        int contMayores = 0;
        int contFinal = 0;

        for (int i = 0; i < 10; i++) {
            arrayNum[i] = (int)(Math.random() * 201)+0;
        }

        for (int i = 0; i < 10; i++) {
            if (arrayNum[i] <= 100) {
                menores[contMenores] = arrayNum[i];
                contMenores++;
            } else {
                mayores[contMayores] = arrayNum[i];
                contMayores++;
            }
        }

        int i = 0;

        while (i < contMenores && i < contMayores) {
            arrayNumCambiado[contFinal] = menores[i];
            contFinal++;

            arrayNumCambiado[contFinal] = mayores[i];
            contFinal++;

            i++;
        }

        while (i < contMenores) {
            arrayNumCambiado[contFinal] = menores[i];
            contFinal++;
            i++;
        }

        i = contFinal / 2;

        while (i < contMayores) {
            arrayNumCambiado[contFinal] = mayores[i];
            contFinal++;
            i++;
        }

        System.out.println("Array original:");

        for (int j = 0; j < 10; j++) {
            System.out.printf("| %-3d", j);
        }

        System.out.println();

        for (int j = 0; j < 10; j++) {
            System.out.printf("| %-3d", arrayNum[j]);
        }

        // Mostrar el array cambiado
        System.out.println("\n\nArray cambiado:");

        for (int j = 0; j < 10; j++) {
            System.out.printf("| %-3d", j);
        }

        System.out.println();

        for (int j = 0; j < 10; j++) {
            System.out.printf("| %-3d", arrayNumCambiado[j]);
        }
    }
}