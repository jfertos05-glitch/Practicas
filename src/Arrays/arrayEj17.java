package Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class arrayEj17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean numEncontrado = false;
        int numCambio = 0;
        int numIntoducido = 0;
        int contadorFreno = 0;
        int contador = 0;
        int[] arrayNum = new int[10];
        int[] arrayNumCambiado = new int[10];

        for (int i = 0; i < 10; i++) {
            arrayNum[i] = (int)(Math.random()*101)+0;
        }

        System.out.println("Lista original: ");

        for (int i = 0; i < 10; i++) {
            System.out.printf(" %-2d ", arrayNum[i]);
        }
        System.out.println();

        while (!numEncontrado) {

            System.out.print("Por favor, introduzca un número a rotar: ");
            numIntoducido = sc.nextInt();

            for (int i = 0; i < 10; i++) {
                if (numIntoducido == arrayNum[i]) {
                    numCambio = arrayNum[i];
                    contadorFreno = i;
                    numEncontrado = true;
                    break;
                }
            }
        }

        arrayNumCambiado [0] = numCambio;

        for (int i = 1; i <= 9 - contadorFreno; i++) {
            arrayNumCambiado[i] = arrayNum[contadorFreno+i];
        }

        for (int i = 10 - contadorFreno; i < 10; i++) {
            arrayNumCambiado[i] = arrayNum[contador];
            contador++;
        }

        System.out.println("Lista cambiada: ");

        for (int i = 0; i < 10; i++) {
            System.out.printf(" %-2d ", arrayNumCambiado[i]);
        }
    }
}
