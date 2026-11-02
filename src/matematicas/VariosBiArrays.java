package matematicas;

public class VariosBiArrays {
    public static int[][] generaArrayBiInt(int fila,int columna, int minimo, int maximo) {
        int[][] arrayBiNumeros = new int[fila][columna];

        for (int filaF = 0; filaF < arrayBiNumeros.length; filaF++) {
            for (int columnaF = 0; columnaF < arrayBiNumeros[filaF].length; columnaF++) {
                arrayBiNumeros[filaF][columnaF] = (int)(Math.random() * (maximo - minimo + 1) + minimo);
            }
        }

        return arrayBiNumeros;
    }

    public static int[] filaDeArrayBiInt(int[][] arrayBi, int fila) {
        int[] arrayFila = new int[arrayBi[fila].length];

        for (int columnaF = 0; columnaF < arrayBi[fila].length; columnaF++) {
            arrayFila[columnaF] = arrayBi[fila][columnaF];
        }

        return arrayFila;
    }

    public static int[] columnaDeArrayBilnt(int arrayBi[][], int columna) {
        int arrayColumna[] = new int[arrayBi.length];

        for (int filaF = 0; filaF < arrayBi.length; filaF++) {
            for (int columnaF = 0; columnaF < arrayBi[filaF].length; columnaF++) {

                if (columna == columnaF) {
                    arrayColumna[filaF] = arrayBi[filaF][columnaF];
                }

            }
        }

        return  arrayColumna;
    }

    public static int[] coordenadasEnArrayBiInt(int[][] arrayBi, int numero) {
        int[] coordenadas = {-1, -1};

        for (int filaF = 0; filaF < arrayBi.length; filaF++) {
            for (int columnaF = 0; columnaF < arrayBi[filaF].length; columnaF++) {

                if (arrayBi[filaF][columnaF] == numero) {
                    coordenadas[0] = filaF;
                    coordenadas[1] = columnaF;
                    return coordenadas;
                }

            }
        }

        return coordenadas;
    }

    public static boolean esPuntoDeSilla(int[][] arrayBi, int numero) {
        int[] coordenadas = coordenadasEnArrayBiInt(arrayBi, numero);

        if (coordenadas[0] == -1) {
            return false;
        }

        int fila = coordenadas[0];
        int columna = coordenadas[1];

        // Comprobar si es el mínimo de su fila
        for (int columnaF = 0; columnaF < arrayBi[fila].length; columnaF++) {
            if (arrayBi[fila][columnaF] < numero) {
                return false;
            }
        }

        for (int filaF = 0; filaF < arrayBi.length; filaF++) {
            if (arrayBi[filaF][columna] > numero) {
                return false;
            }
        }

        return true;
    }

    public static int[] diagonal(int[][] arrayBi, int fila, int columna, String direccion) {
        int[] resultado = new int[arrayBi.length];

        int contador = 0;

        if (direccion.equals("nose")) {

            while (fila < arrayBi.length && columna < arrayBi[fila].length) {

                resultado[contador] = arrayBi[fila][columna];

                fila++;
                columna++;
                contador++;
            }

        } else if (direccion.equals("neso")) {

            while (fila < arrayBi.length && columna >= 0) {

                resultado[contador] = arrayBi[fila][columna];

                fila++;
                columna--;
                contador++;
            }

        }

        int[] arrayFinal = new int[contador];

        for (int i = 0; i < contador; i++) {
            arrayFinal[i] = resultado[i];
        }

        return arrayFinal;
    }

}
