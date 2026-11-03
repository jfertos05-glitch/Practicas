package Funciones;

public class funcionesEj53 {
    public static int nEsimo(int[][] n, int posicion) {
        int contador = 0;

        for (int fila = 0; fila < n.length; fila++) {
            for (int columna = 0; columna < n[fila].length; columna++) {

                if (contador == posicion) {
                    return n[fila][columna];
                }

                contador++;
            }
        }

        return -1;
    }
}
