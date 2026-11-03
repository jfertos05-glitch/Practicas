package Funciones;

public class funcionesEj56 {
    public static int[] corteza(int[][] n) {

        int filas = n.length;
        int columnas = n[0].length;

        int[] resultado = new int[filas * 2 + columnas * 2 - 4];
        int contador = 0;

        for (int i = 0; i < columnas; i++) {
            resultado[contador] = n[0][i];
            contador++;
        }

        for (int i = 1; i < filas; i++) {
            resultado[contador] = n[i][columnas - 1];
            contador++;
        }

        for (int i = columnas - 2; i >= 0; i--) {
            resultado[contador] = n[filas - 1][i];
            contador++;
        }

        for (int i = filas - 2; i > 0; i--) {
            resultado[contador] = n[i][0];
            contador++;
        }

        return resultado;
    }
}
