import java.util.Scanner;

public class numAleatorioEj28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Por favor, introduzca el tamaño del array: ");
        int tamaño = sc.nextInt();
        int[] numAleatorio = new int[tamaño];
        int [] numInvertido = new int[tamaño];

        for (int i = 0; i < tamaño; i++) {
            numAleatorio[i] = (int)(Math.random() * 200) + 1;
        }

        System.out.println("Array original:");

        System.out.print("Índice: ");

        for (int i = 0; i < tamaño; i++) {
            System.out.printf("%5d", i); //Hace que el número ocupe 5 espacios
        }
        System.out.println();

        System.out.print("Valor:  ");

        for (int i = 0; i < tamaño; i++) {
            System.out.printf("%5d", numAleatorio[i]); //Hace que el número ocupe 5 espacios
        }

        System.out.println();

        System.out.println("Array resultado:");

        System.out.print("Índice: ");

        for (int i = 0; i < tamaño; i++) {
            numInvertido[i] = numAleatorio[tamaño- 1 -i];
        }

        for (int i = 0; i < tamaño; i++) {
            System.out.printf("%5d", i); //Hace que el número ocupe 5 espacios
        }

        System.out.println();

        System.out.print("Valor:  ");

        for (int i = 0; i < tamaño; i++) {

            if (i !=1 && i == 0 || i % 2 == 0) {
                System.out.printf("%5d", numAleatorio[i]); //Hace que el número ocupe 5 espacios
            }
        }

        for (int i = 0; i < tamaño; i++) {

            if (tamaño % 2 == 0) {

                if (i != 1 && i % 2 == 0 && i != tamaño-1) {
                    System.out.printf("%5d", numInvertido[i]); //Hace que el número ocupe 5 espacios
                }

            } else {

                if (i % 2 == 0 && i == 1 || i != 0 && i % 2 != 0) {
                    System.out.printf("%5d", numInvertido[i]); //Hace que el número ocupe 5 espacios
                }

            }
        }

    }
}