package Funciones;

public class funcionesEj48 {
    public static int[] concatena(int[] a, int[] b) {
        int[] resultado = new int[a.length + b.length];
        int contadorA = 0;
        int contadorB = 0;

        for (int i = 0; i < (a.length + b.length); i++) {
            if (i < a.length) {
                resultado[i] = a[contadorA];
                contadorA++;
            } else {
                resultado[i] = b[contadorB];
                contadorB++;
            }
        }

        return resultado;
    }
}
