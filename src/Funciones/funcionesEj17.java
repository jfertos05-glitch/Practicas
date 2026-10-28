package Funciones;

import java.util.Scanner;

public class funcionesEj17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Dime un numero en binario: ");
        int numBinario = sc.nextInt();
        int numTraducido = 0;

        for (int i = 0; i < matematicas.Varias.digitos(numBinario); i++) {

            if (matematicas.Varias.digitoN(numBinario, i) == 1) {
                numTraducido = (int) (numTraducido + matematicas.Varias.potencia(2, i));
            }

        }

        System.out.print("\n" + numTraducido);
    }
}