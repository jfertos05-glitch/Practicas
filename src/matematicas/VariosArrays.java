
package matematicas;

public class VariosArrays {

    // 1. Genera un array de n números aleatorios
    public static int[] generaArrayInt(int n, int minimo, int maximo) {
        int[] numArray = new int[n];

        for (int i = 0; i < numArray.length; i++) {
            numArray[i] = (int)(Math.random() * (maximo - minimo + 1) + minimo);
        }

        return numArray;
    }

    // 2. Devuelve el mínimo del array
    public static int minimoArrayInt(int numArray[]) {
        int minimo = Integer.MAX_VALUE;

        for (int i = 0; i < numArray.length; i++) {
            if (numArray[i] < minimo) {
                minimo = numArray[i];
            }
        }

        return minimo;
    }

    // 3. Devuelve el máximo del array
    public static int maximoArrayInt(int numArray[]) {
        int maximo = Integer.MIN_VALUE;

        for (int i = 0; i < numArray.length; i++) {
            if (numArray[i] > maximo) {
                maximo = numArray[i];
            }
        }

        return maximo;
    }

    // 4. Devuelve la media del array
    public static double mediaArrayInt(int numArray[]) {
        int suma = 0;

        for (int i = 0; i < numArray.length; i++) {
            suma = suma + numArray[i];
        }

        return (double) suma / numArray.length;
    }

    // 5. Dice si un número está en el array
    public static boolean estaEnArrayInt(int numArray[], int numElegido) {
        for (int i = 0; i < numArray.length; i++) {
            if (numElegido == numArray[i]) {
                return true;
            }
        }

        return false;
    }

    // 6. Devuelve la posición de un número
    public static int posicionEnArray(int numArray[], int numElegido) {
        for (int i = 0; i < numArray.length; i++) {
            if (numElegido == numArray[i]) {
                return i;
            }
        }

        return -1;
    }

    // 7. Da la vuelta al array
    public static int[] volteaArrayInt(int numArray[]) {
        int[] resultado = new int[numArray.length];

        for (int i = 0; i < numArray.length; i++) {
            resultado[i] = numArray[numArray.length - 1 - i];
        }

        return resultado;
    }

    // 8. Rota el array n posiciones a la derecha
    public static int[] rotaDerechaArrayInt(int numArray[], int n) {
        int aux;

        for (int i = 0; i < n; i++) {
            aux = numArray[numArray.length - 1];

            for (int j = numArray.length - 1; j > 0; j--) {
                numArray[j] = numArray[j - 1];
            }

            numArray[0] = aux;
        }

        return numArray;
    }

    // 9. Rota el array n posiciones a la izquierda
    public static int[] rotaIzquierdaArrayInt(int numArray[], int n) {
        int aux;

        for (int i = 0; i < n; i++) {
            aux = numArray[0];

            for (int j = 0; j < numArray.length - 1; j++) {
                numArray[j] = numArray[j + 1];
            }

            numArray[numArray.length - 1] = aux;
        }

        return numArray;
    }
}
