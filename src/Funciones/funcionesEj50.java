package Funciones;

public class funcionesEj50 {
    public static int[] mezcla(int[] a, int[] b) {

        int[] resultado = new int[a.length + b.length];
        int contadorA = 0;
        int contadorB = 0;

        for (int i = 0; i < resultado.length; i++) {

            if (contadorA < a.length && (i % 2 == 0 || contadorB >= b.length)) {
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