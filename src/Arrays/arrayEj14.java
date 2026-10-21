package Arrays;

import java.util.Scanner;

public class arrayEj14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arrayInicial = new String[8];
        String[] arrayFinal = new String[8];
        String[] arrayColores = new String[]{"verde", "rojo", "azul", "amarillo", "naranja", "rosa", "negro", "blanco", "morado"};
        int contador = 0;

        System.out.println("Escriba ocho palabras: ");

        for (int i = 0; i < 8; i++) {
            arrayInicial[i] = sc.nextLine();
        }


        for (int i = 0; i < 8; i++) {
            boolean esColor = false;

            for (int a = 0; a < 9; a++) {
                if (arrayInicial[i].equals(arrayColores[a])) {
                    esColor = true;
                    break; //te saca del bucle
                }
            }

            if (esColor) {
                arrayFinal[contador] = arrayInicial[i];
                contador++;
            }
        }

        for (int i = 0; i < 8; i++) {
            boolean esColor = false;

            for (int a = 0; a < 9; a++) {
                if (arrayInicial[i].equals(arrayColores[a])) {
                    esColor = true;
                    break;
                }
            }

            if (!esColor) {
                arrayFinal[contador] = arrayInicial[i];
                contador++;
            }
        }


        for (int i = 0; i < 8; i++) {
            System.out.print(arrayFinal[i] + " - ");
        }
    }
}
