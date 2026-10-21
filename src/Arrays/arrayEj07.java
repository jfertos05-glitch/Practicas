package Arrays;
import java.util.Scanner;
import java.util.Arrays;

public class arrayEj07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrayNum[] = new int[100];
        int valor1 = 0;
        int valor2 = 0;

        for (int i = 0  ;i < 100 ; i++) {
            arrayNum [i]= (int)(Math.random()*20)+0;
        }

        System.out.print("Por favor escriba un número del 0 al 20: ");
        valor1 = sc.nextInt();
        System.out.print("Por favor escriba otro número para intercambiarlo por el primero: ");
        valor2 = sc.nextInt();

        System.out.println("Numeros sin cambios: ");
        for (int i = 0  ;i < 100 ; i++) {
            System.out.print(arrayNum [i] + " ");
        }
        System.out.println();

        System.out.println("Numeros intercambiados");

        for (int i = 0  ;i < 100 ; i++) {

            if (arrayNum [i] == valor1) {
                arrayNum [i] = valor2;
                System.out.print("'" + arrayNum [i] + "'" + " ");
            } else {
                System.out.print(arrayNum [i] + " ");
            }


        }

    }
}
